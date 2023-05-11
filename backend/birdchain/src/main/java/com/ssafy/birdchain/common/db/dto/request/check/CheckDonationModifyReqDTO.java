package com.ssafy.birdchain.common.db.dto.request.check;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class CheckDonationModifyReqDTO {

    @Schema(description = "기부자 지갑 주소")
    String wallet;

    @Schema(description = "수정할 NFT 이미지셋 번호")
    Integer num;

}