SUMMARY = "PDF Table Extraction for Humans"
DESCRIPTION = "Camelot is a Python library that can help you extract tables from PDFs!"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python313-camelot-py-0.11.0-2.5.noarch.rpm"
RPM_HASH = "cd25ec9eaf7fec3ea4966a1be08ee30a145cee5e8cc7f3948553a01cb24fcaa2a9ac616ec2a1973d492c12b504c818666f9069ec7b934b96a4038729c28c23a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-camelot-py \
python3.13dist-camelot-py \
python313-camelot-py \
python3dist-camelot-py"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-chardet \
python313-click \
python313-numpy \
python313-openpyxl \
python313-pandas \
python313-pdfminer.six \
python313-pypdf \
python313-tabulate"

inherit rpm
