SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-enrich-1.3.0-2.4.noarch.rpm"
RPM_HASH = "db983840b348f088b344a29067e5c97ef1784501801b267d532369814ff47933f41787d292b0c27a658c514a81635ce56f5e474414dd4e7dfe176a5a9b3014d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enrich \
python3.13dist-enrich \
python313-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.13dist-rich \
python313-rich"

inherit rpm
