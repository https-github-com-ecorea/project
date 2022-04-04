package com.project.ecorea.dto;

import java.util.*;

import com.project.ecorea.entity.*;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class ChProveDto {
	@Data
	public static class Prove {
		private Integer cpno;
		private String cpimg;
		private String cptitle;
		private String cpregday;
	}
	
	@Data
	public static class ProveList {
		private String cname;
		private List<Prove> proves;				
	}
	
	@Data
	@Builder
	public static class InputProve {
		private Integer cno;
		private String cptitle;
		private String cpcontent;
		private String cpimg;
		
		public ChProve toEntity() {
			return ChProve.builder().cno(cno).cptitle(cptitle).cpcontent(cpcontent).cpimg(cpimg).build();
		}
	}
}
