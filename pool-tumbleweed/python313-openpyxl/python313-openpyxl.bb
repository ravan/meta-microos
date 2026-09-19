SUMMARY = "A Python library to read/write Excel 2010 xlsx/xlsm files"
DESCRIPTION = "openpyxl is a pure python reader and writer of Excel OpenXML files. \
It is ported from the PHPExcel project"
LICENSE = "MIT & Python-2.0"

PV = "3.1.5"

RPM_NAME = "python313-openpyxl-3.1.5-1.9.noarch.rpm"
RPM_HASH = "2bc30f0c82d8415c1b7b27e2a81a8759e3028ad0b25cc734c131749502d4114ce284871c9f06b0b0a2c3e7aeea8a20e7546ce93a3059ad8ec4c0cd0eb2bb3018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openpyxl \
python3.13dist-openpyxl \
python313-openpyxl \
python3dist-openpyxl"

RDEPENDS:${PN} += "python-abi \
python313-et-xmlfile"

inherit rpm
