package com.ssm.login.pojo;

public class Weight {
		private int id;
		private String tDynasty;
		private String tJin;
		private String tDan;
		private String tJun;
		private String tLiang;
		private String tZhu;
		private String tQian;
		private String tFen;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String gettDynasty() {
			return tDynasty;
		}
		public void settDynasty(String tDynasty) {
			this.tDynasty = tDynasty;
		}
		public String gettJin() {
			return tJin;
		}
		public void settJin(String tJin) {
			this.tJin = tJin;
		}
		public String gettDan() {
			return tDan;
		}
		public void settDan(String tDan) {
			this.tDan = tDan;
		}
		public String gettJun() {
			return tJun;
		}
		public void settJun(String tJun) {
			this.tJun = tJun;
		}
		public String gettLiang() {
			return tLiang;
		}
		public void settLiang(String tLiang) {
			this.tLiang = tLiang;
		}
		public String gettZhu() {
			return tZhu;
		}
		public void settZhu(String tZhu) {
			this.tZhu = tZhu;
		}
		public String gettQian() {
			return tQian;
		}
		public void settQian(String tQian) {
			this.tQian = tQian;
		}
		public String gettFen() {
			return tFen;
		}
		public void settFen(String tFen) {
			this.tFen = tFen;
		}
		@Override
		public String toString() {
			return "Weight [id=" + id + ", tDynasty=" + tDynasty + ", tJin=" + tJin + ", tDan=" + tDan + ", tJun="
					+ tJun + ", tLiang=" + tLiang + ", tZhu=" + tZhu + ", tQian=" + tQian + ", tFen=" + tFen + "]";
		}
		
}
