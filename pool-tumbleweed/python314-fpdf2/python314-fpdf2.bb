SUMMARY = "Simple & fast PDF generation for Python"
DESCRIPTION = "Simple & fast PDF generation for Python."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.7"

RPM_NAME = "python314-fpdf2-2.8.7-1.2.noarch.rpm"
RPM_HASH = "24a6e5580f46d421b3a5866746a16e3cf0477d248b3894da6cd0c161e5d8cdb299bfc17267212ba1348118a5d9f747a3e6078daf8d0823fbb337087709fa5b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fpdf2 \
python314-fpdf2 \
python3dist-fpdf2"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-defusedxml \
python314-fonttools"

inherit rpm
