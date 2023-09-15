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
