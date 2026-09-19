SUMMARY = "BSON codec for Python"
DESCRIPTION = "BSON codec for Python."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.5.10"

RPM_NAME = "python313-bson-0.5.10-6.4.noarch.rpm"
RPM_HASH = "1619b15a0af6c2511ff2e40f085e1c03382cacc1950ae49c81f79129c205ab90d686537f76986144546d82a24cc064697442aa7670d4a7c65c19abbb9af643de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bson \
python3.13dist-bson \
python313-bson \
python3dist-bson"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
