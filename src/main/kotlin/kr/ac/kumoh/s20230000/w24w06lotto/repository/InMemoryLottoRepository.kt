package kr.ac.kumoh.s20230000.w24w06lotto.repository

import kr.ac.kumoh.s20230000.w24w06lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository : LottoRepository {
    private var storedLottoNumber: LottoNumber? = null

    override fun save(lottoNumber: LottoNumber): LottoNumber {
        storedLottoNumber = lottoNumber
        
        // NOTE: return type이 LottoNumber로 nullable이 아니므로
        // nullable 넘겨줄 수 없음
        // 지금은 return lottoNumber 사용할 수도 있음
        // 나중에 데이터베이스 사용하면 읽어와서 return하는 것이 좋음
        return storedLottoNumber!!
    }

    override fun find(): LottoNumber? {
        return storedLottoNumber
    }
}