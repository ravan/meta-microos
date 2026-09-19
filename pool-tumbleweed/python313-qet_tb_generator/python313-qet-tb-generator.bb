SUMMARY = "Generates terminal blocks & connectors for QElectroTech"
DESCRIPTION = "Allows to generate terminal blocks and connectors for QElectroTech \
electrical diagram software."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "python313-qet_tb_generator-1.3.1-2.5.noarch.rpm"
RPM_HASH = "013cdb0f2ab874aea2b3cc198e2fbfd1d44befc4ccd1a0abba34567cca56003d392558a634c4dbbb325c392ee0e0ee3ee8a62c0636395d376f6c6dc70eea8314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qet-tb-generator \
python3.13dist-qet-tb-generator \
python313-qet-tb-generator \
python3dist-qet-tb-generator"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-qt5 \
qelectrotech"

inherit rpm
