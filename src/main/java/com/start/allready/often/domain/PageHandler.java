package com.start.allready.often.domain;

public class PageHandler {

    private int page; // 현재 페이지
    private int pageSize; // 한 페이지에 목록 수
    private int beginPage; // 처음 (이동)
    private int endPage;  // 끝 (이동)
    private int naviSize = 10; // 이동 목록
    private boolean showPrev; // < 버튼 (이동)
    private boolean showNext; // > 버튼 (이동)
    private int totalPage;  // 총 페이지 수
    private int totalCnt; //총 게시물 수

    //페이징
    public PageHandler(int totalCnt, int page, int pageSize){
        this.totalCnt = totalCnt;
        this.page = page;
        this.pageSize = pageSize;

        totalPage =(int)Math.ceil(totalCnt/(double)pageSize);
        beginPage = page / naviSize * naviSize +1;
        endPage = Math.min(beginPage + naviSize-1, totalPage);
        showPrev = beginPage !=1;
        showNext = endPage != totalPage;
    }

    //페이지 출력
    void print(){
        System.out.println("page ="+ page);
        System.out.print(showPrev ? "[PREV]" : " ");
        for(int i= beginPage; i <=endPage; i++){
            System.out.print(i+" ");
        }
        System.out.print(showNext ? "[NEXT]" :" " );
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getNaviSize() {
        return naviSize;
    }

    public void setNaviSize(int naviSize) {
        this.naviSize = naviSize;
    }

    public boolean isShowPrev() {
        return showPrev;
    }

    public void setShowPrev(boolean showPrev) {
        this.showPrev = showPrev;
    }

    public boolean isShowNext() {
        return showNext;
    }

    public void setShowNext(boolean showNext) {
        this.showNext = showNext;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(int totalCnt) {
        this.totalCnt = totalCnt;
    }

    @Override
    public String toString() {
        return "PageHandler{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", beginPage=" + beginPage +
                ", endPage=" + endPage +
                ", naviSize=" + naviSize +
                ", showPrev=" + showPrev +
                ", showNext=" + showNext +
                ", totalPage=" + totalPage +
                ", totalCnt=" + totalCnt +
                '}';
    }
}
