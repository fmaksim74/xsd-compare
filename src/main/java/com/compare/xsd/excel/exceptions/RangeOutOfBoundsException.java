package com.compare.xsd.excel.exceptions;

public class RangeOutOfBoundsException extends InvalidCellRangeException {
    public RangeOutOfBoundsException(String range) {
        super("Cell range " + range + " is out of bounds");
        this.range = range;
    }
}
