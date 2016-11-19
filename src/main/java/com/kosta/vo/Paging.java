package com.kosta.vo;

//페이징 처리는 자꾸 잊어버려서 주석을 꼼꼼하게 달아놓음 
public class Paging {
  //보여줄 페이지 번호
  private int page;
  //전체 글갯수
  private int totalCount;
  //하단에서 표시해줄 시작페이지
  private int startPage;
  //하단에서 표시해줄 끝페이지
  private int endPage;
  //이전버튼
  private boolean prev;
  //다음버튼
  private boolean next;

  //보여줄 페이지 번호
  //EX> 3페이지
  public void setPage(int page) {

    if (page <= 0) {
      this.page = 1;
      return;
    }

    this.page = page;
  }

  public int getPage() {
    return page;
  }

  //시작데이터의수(보여줄 페이지 번호-1 * 10)
  //EX> 3페이지는 20~30번의 글을 보여줘야함
  //	그러므로 (3-1)*10=20부터 보여주는것을 계산
  public int getPageWriting() {
    return (this.page - 1) * 10;
  }
  
  
  public void setTotalCount(int totalCount) {
	    this.totalCount = totalCount;
	    calcData();
  }

  //하단의 페이징처리
  private void calcData() {
	  //현재 페이지(getPage) 입력받아서 보여줄 페이지 만큼 나누기 -> 소수점 올림 -> 다시 보여줄 페이지만큼 곱하기
	  //EX> 현재 페이지가24에 10페이지씩 보여주고 싶음
	  // 24/10=2.4 -> 소수점 올림으로 3 -> 3*10=30
	  //즉 하단 페이징의 끝은 30페이지
	  endPage=(int)(Math.ceil(getPage()/10)*10);
	  
	  //끝페이지에서-10+1 하면 당연히 시작페이지
	  //EX> 현재 페이지가 24페이지에 10페이지씩 보여주고 싶음
	  //끝페이지는 위의 계산으로 30페이지임
	  //(30-10)+1=21 즉 하단 페이징의 시작은 21페이지
	  startPage = (endPage - 10) + 1;
	
	  //시작페이지가 1이면, 당연히 뒤로가기 되면 안됨
	  prev = startPage == 1 ? false : true;
	  
	  //끝페이지*10이 총 데이터갯수보다 많다면, 당연히 뒤로가기 안됨
	  //EX> 총 데이터가 114개
	  //END페이지가 110이면 뒤로가기 한번 더있어도 됨
	  //하지만 END페이지가 120이면 뒤로가기가 있어선 안됨
	  next = endPage * 10 >= totalCount ? false : true;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public boolean isNext() {
		return next;
	}
}
