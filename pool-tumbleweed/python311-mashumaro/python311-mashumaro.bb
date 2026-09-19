SUMMARY = "Fast and well tested serialization library"
DESCRIPTION = "Fast and well tested serialization library"
LICENSE = "Apache-2.0"

PV = "3.15"

RPM_NAME = "python311-mashumaro-3.15-1.2.noarch.rpm"
RPM_HASH = "e80bbc6190df90692918a7327df183b8a9ec0563c87d93ce016b54fb91d2f208ceaf13e49f7b6aebc52ea9a3803019b82ac49b06047eb9335930ce2e16d28d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mashumaro \
python3.11dist-mashumaro \
python311-mashumaro \
python3dist-mashumaro"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
