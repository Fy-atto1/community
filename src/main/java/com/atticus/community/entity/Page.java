package com.atticus.community.entity;

/**
 * 封装分页相关的信息
 */
public class Page {

    // 当前页码
    private int current = 1;
    // 每页的显示上限
    private int limit = 10;
    // 数据总行数(用于计算总页数)
    private int rows;
    // 查询路径(用于复用分页链接)
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     *
     * @return int
     */
    public int getOffset() {
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     *
     * @return int
     */
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * 根据当前页码获取起始页码
     *
     * @return int
     */
    public int getFrom() {
//        return (current - 2 < 1) ? 1 : (current - 2);
        return Math.max(current - 2, 1);
    }

    /**
     * 根据当前页码获取结束页码
     *
     * @return int
     */
    public int getTo() {
//        return (current + 2 > getTotal()) ? getTotal() : current + 2;
        return Math.min(current + 2, getTotal());
    }

}
