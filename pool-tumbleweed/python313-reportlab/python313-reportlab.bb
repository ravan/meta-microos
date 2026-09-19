SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "4.5.1"

RPM_NAME = "python313-reportlab-4.5.1-1.2.noarch.rpm"
RPM_HASH = "b3b4056382f4309fc70be39b0f32efefb039cbcc5c3e88a8e485933270ec89f8c71398f557890d529afed7a773aa266ffa81c61c0bf73884fac6e653a8c19fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ReportLab \
python3-reportlab \
python3.13dist-reportlab \
python313-ReportLab \
python313-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "python-abi \
python313-Pillow \
python313-charset-normalizer"

inherit rpm
