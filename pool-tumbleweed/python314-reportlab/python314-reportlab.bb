SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "4.5.1"

RPM_NAME = "python314-reportlab-4.5.1-1.2.noarch.rpm"
RPM_HASH = "4a5faaa389b4069e9945ec604aec01045c77fd51e6019925d574292e48599846bf916934e69ad5a2f1c104887611cf58203604422e25b3f684b682ea1d944767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-reportlab \
python314-ReportLab \
python314-reportlab \
python3dist-reportlab"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-charset-normalizer"

inherit rpm
