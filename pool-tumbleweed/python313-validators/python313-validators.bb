SUMMARY = "Python Data Validation"
DESCRIPTION = "Python Data Validation for Humans."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "python313-validators-0.35.0-1.5.noarch.rpm"
RPM_HASH = "6d54eaf8abe209839d1b71e7b64227315b793dc093d345c670ddd19c63371e7cdc06f131a0269ac642da10b6a126575a045a356284921dd5717d3a12ac1f9539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-validators \
python3.13dist-validators \
python313-validators \
python3dist-validators"

RDEPENDS:${PN} += "python-abi"

inherit rpm
