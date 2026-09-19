SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python314-qet_tb_generator-1.3.1-2.5.noarch.rpm"
RPM_HASH = "22858eb144cb129fe96465be339a31352ec0c1973a559d16beda90a6160b7a269dfce025a120517440bdee71548558667cbb86b006a4e90bf8f9af255eba619c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-qet-tb-generator \
python314-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-qt5 \
qelectrotech"

inherit rpm
