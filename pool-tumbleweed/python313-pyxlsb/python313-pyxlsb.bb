SUMMARY = "Excel 2007-2010 Binary Workbook (xlsb) parser"
DESCRIPTION = "Excel 2007-2010 Binary Workbook (xlsb) parser"
LICENSE = "LGPL-3.0+"

PV = "1.0.10"

RPM_NAME = "python313-pyxlsb-1.0.10-1.9.noarch.rpm"
RPM_HASH = "316e9136bcd8305ba1166243328c15c8066ccfa9e5a29f65ce76c5f16c33be6ea7a8eb61085422889df2d58bb06e02c328e3e234a04d59f29065e316229e1512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyxlsb \
python3.13dist-pyxlsb \
python313-pyxlsb \
python3dist-pyxlsb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
