SUMMARY = "Calculator for rofi"
DESCRIPTION = "A rofi plugin that uses libqalculate's qalc to parse natural language \
input and provide results. \
 \
Since this uses libqalculate's qalc, natural language queries such as \
'500 + 25%' or '5000 EUR to USD' or '150 to hex' can be input. \
It can also solve linear equations on the fly, like '60x + 30 = 50' \
for instance."
LICENSE = "MIT"

PV = "2.5.1"

RPM_NAME = "rofi-calc-2.5.1-1.4.aarch64.rpm"
RPM_HASH = "addec4e4203276281250e7a8c7b14a0f7b6467b992717b485db527667b5b723fafc2d5c34df2ec24a7e2c28e809016aa3272a09fe3ff063ad486cca2ecb6f091"

RPROVIDES:${PN} += "libcalc.so \
rofi-calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
qalculate \
rofi-launcher"

inherit rpm
