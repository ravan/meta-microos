SUMMARY = "Excel 2007-2010 Binary Workbook (xlsb) parser"
DESCRIPTION = "Excel 2007-2010 Binary Workbook (xlsb) parser"
LICENSE = "LGPL-3.0+"

PV = "1.0.10"

RPM_NAME = "python314-pyxlsb-1.0.10-1.9.noarch.rpm"
RPM_HASH = "45634ba657c2f1aee93dc16977df4962506d98a10b06708f5ff0161f78e8ded7b7a4878d59d4921d99a837e941a9ab87352124c3df460821bd0e594ab8765452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyxlsb \
python314-pyxlsb \
python3dist-pyxlsb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
