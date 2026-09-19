SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-3-Clause & BSD-4-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python313-xlwt-1.3.0-4.5.noarch.rpm"
RPM_HASH = "ecc92276863b755fe94a39744d2f0b6b5f929be040e79f8ee2dec620df8baf2f3d7d427ec4a009a0cad92fa565e57872673acfa852f1f04b74bf517221077e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xlwt \
python3.13dist-xlwt \
python313-xlwt \
python3dist-xlwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
