SUMMARY = "DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "DMTF Cloud Audit (CADF) data model"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python313-pycadf-4.1.0-1.1.noarch.rpm"
RPM_HASH = "f802e1a9d8b3c325149c4e0fd714d28ffecb92fe0a3bf7b4315363693bf16bb5433ae4cdbc2018939b1029b3152a9a595d390b10415b82bf40713a4a4a6dedc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycadf \
python3.13dist-pycadf \
python313-pycadf \
python3dist-pycadf"

RDEPENDS:${PN} += "python-abi \
python3-pycadf-common \
python313-debtcollector \
python313-oslo.config \
python313-oslo.serialization \
python313-pytz \
python313-six"

inherit rpm
