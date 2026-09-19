SUMMARY = "DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "DMTF Cloud Audit (CADF) data model"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python314-pycadf-4.1.0-1.1.noarch.rpm"
RPM_HASH = "9f6ad10b28bd81ed490f1d9af78db5af7f77c46f6ad258c78d4119a5d4ac0a73e6917b67f4487a5ca0cc6c79badf57bc1d1f9aca8ef9944e6d72e05242fe8eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycadf \
python314-pycadf \
python3dist-pycadf"

RDEPENDS:${PN} += "python-abi \
python3-pycadf-common \
python314-debtcollector \
python314-oslo.config \
python314-oslo.serialization \
python314-pytz \
python314-six"

inherit rpm
