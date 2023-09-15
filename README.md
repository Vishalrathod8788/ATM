# ATM

select sb.bs_id, sb.bs_date, cu.c_name, p.pt_name, s.s_name, sb.bs_rate, sb.no_of_day, sb.bs_total
from
tbl_bill_service sb,
tbl_customer cu,
tbl_pet_type p,
tbl_service s
where
sb.c_name = cu.c_id AND
sb.p_name = p.pt_id AND
sb.s_name = s.s_id

===================================================================================================

select 
bp.bp_id, 
c.c_name,
bp.bp_date, 
p.pro_name, 
bp.qty, 
bp.rate, 
bp.total 
from
tbl_bill_pro bp,
tbl_customer c,
tbl_product p
where 
bp.c_name = c.c_id AND
bp.pro_name = p.pro_id;
