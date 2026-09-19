SUMMARY = "Simple & fast PDF generation for Python"
DESCRIPTION = "Simple & fast PDF generation for Python."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.7"

RPM_NAME = "python313-fpdf2-2.8.7-1.2.noarch.rpm"
RPM_HASH = "ba38832d37a8d5cffbbd529eab43d5b586a0fa18d718ba7472f4c23114e934b8a0fa0e0d61168c5539c39de4eabe7a695684e75f112f48d1e4f23e00e9abb663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fpdf2 \
python3.13dist-fpdf2 \
python313-fpdf2 \
python3dist-fpdf2"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-defusedxml \
python313-fonttools"

inherit rpm
