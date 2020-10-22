package com.jellyfishmix.interchange.common.util;

import com.jellyfishmix.interchange.common.enums.ResultVOEnum;
import com.jellyfishmix.interchange.common.vo.ResultVO;

/**
 * @author JellyfishMIX
 * @date 2020/4/8 10:03 下午
 */
public class ResultVOUtil {
    // success

    public static ResultVO success(Integer code, String message) {
        ResultVO resultVO = ResultVO.builder()
                .code(code)
                .message(message)
                .build();
        return resultVO;
    }

    public static ResultVO success(Integer code, String message, Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
        return resultVO;
    }

    public static ResultVO success(ResultVOEnum resultVOEnum) {
        ResultVO resultVO = ResultVO.builder()
                .code(resultVOEnum.getCode())
                .message(resultVOEnum.getMessage())
                .build();
        return resultVO;
    }

    public static ResultVO success(ResultVOEnum resultVOEnum, Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(resultVOEnum.getCode())
                .message(resultVOEnum.getMessage())
                .data(data)
                .build();
        return resultVO;
    }

    public static ResultVO success() {
        ResultVO resultVO = ResultVO.builder()
                .code(ResultVOEnum.SUCCESS.getCode())
                .message(ResultVOEnum.SUCCESS.getMessage())
                .build();
        return resultVO;
    }

    public static ResultVO success(Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(ResultVOEnum.SUCCESS.getCode())
                .message(ResultVOEnum.SUCCESS.getMessage())
                .data(data)
                .build();
        return resultVO;
    }

    // fail

    public static ResultVO fail(Integer code, String message) {
        ResultVO resultVO = ResultVO.builder()
                .code(code)
                .message(message)
                .build();
        return resultVO;
    }

    public static ResultVO fail(Integer code, String message, Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
        return resultVO;
    }

    public static ResultVO fail(ResultVOEnum resultVOEnum) {
        ResultVO resultVO = ResultVO.builder()
                .code(resultVOEnum.getCode())
                .message(resultVOEnum.getMessage())
                .build();
        return resultVO;
    }

    public static ResultVO fail(ResultVOEnum resultVOEnum, Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(resultVOEnum.getCode())
                .message(resultVOEnum.getMessage())
                .data(data)
                .build();
        return resultVO;
    }

    public static ResultVO fail() {
        ResultVO resultVO = ResultVO.builder()
                .code(ResultVOEnum.FAILED.getCode())
                .message(ResultVOEnum.FAILED.getMessage())
                .build();
        return resultVO;
    }

    public static ResultVO fail(Object data) {
        ResultVO resultVO = ResultVO.builder()
                .code(ResultVOEnum.FAILED.getCode())
                .message(ResultVOEnum.FAILED.getMessage())
                .data(data)
                .build();
        return resultVO;
    }
}
