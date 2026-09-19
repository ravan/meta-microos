SUMMARY = "authres - Authentication Results Header Module"
DESCRIPTION = "authres - Authentication Results Header Module"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python313-authres-1.2.0-3.5.noarch.rpm"
RPM_HASH = "7d3f1c3f95ea2d89aa49f0eab6ac0cbdd3f72a4582a900cf772c3b5aa4f10a9b126f9764c0417e86376b99c0f30abafc70572c80d5255421da7500f80e90103c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-authres \
python3.13dist-authres \
python313-authres \
python3dist-authres"

RDEPENDS:${PN} += "python-abi"

inherit rpm
