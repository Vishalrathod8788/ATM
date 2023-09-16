#ATM

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
