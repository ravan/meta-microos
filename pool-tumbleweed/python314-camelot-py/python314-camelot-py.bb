SUMMARY = "PDF Table Extraction for Humans"
DESCRIPTION = "Camelot is a Python library that can help you extract tables from PDFs!"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-camelot-py-0.11.0-2.5.noarch.rpm"
RPM_HASH = "d76ad889754b6fb0b0238e110af3ecb7cef7c7a2e36353ca0129dc4423a0c27e41feafb68992ee64c76d9181a356b992a7bd698542675b5710ae3cf56a94c101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-camelot-py \
python314-camelot-py \
python3dist-camelot-py"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-chardet \
python314-click \
python314-numpy \
python314-openpyxl \
python314-pandas \
python314-pdfminer.six \
python314-pypdf \
python314-tabulate"

inherit rpm
