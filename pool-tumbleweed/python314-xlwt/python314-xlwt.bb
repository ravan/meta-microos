SUMMARY = "Library to Create Spreadsheet Files Compatible With MS Excel 97/2000/XP/2003"
DESCRIPTION = "xlwt is a library for generating spreadsheet files that are compatible \
with Excel 97/2000/XP/2003, OpenOffice.org Calc, and Gnumeric. xlwt has \
full support for Unicode. Excel spreadsheets can be generated on any \
platform without needing Excel or a COM server. The only requirement is \
Python 2.3 to 2.6. xlwt is a fork of pyExcelerator."
LICENSE = "BSD-3-Clause & BSD-4-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "python314-xlwt-1.3.0-4.5.noarch.rpm"
RPM_HASH = "a56202830dce9eb3d0ed614cf531e2d92127a39fd9a93cced1a1d7dfccd5542051910990e171eec29f2a5507c3567fd6db53629d2aa9ac299803d89a62bc82a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xlwt \
python314-xlwt \
python3dist-xlwt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
