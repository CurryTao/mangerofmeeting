package com.meeting.m2.util;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class DataGrid implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long total;
    private List<?> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "DataGrid [total=" + total + ", rows=" + rows + "]";
    }

    public DataGrid(Long total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public DataGrid() {
        super();
        // TODO Auto-generated constructor stub
    }


}
