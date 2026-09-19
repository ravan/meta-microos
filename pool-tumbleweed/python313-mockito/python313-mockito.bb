SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "python313-mockito-2.0.4-1.3.noarch.rpm"
RPM_HASH = "8114711bf5e0c2354e89adcf31a79bf0483db936e64dceb1a8f91611076788a8c403a884717f50dbb61672b4300bb572fd013a04e5994a72f365ff331a10a939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mockito \
python3.13dist-mockito \
python313-mockito \
python3dist-mockito"

RDEPENDS:${PN} += "python-abi"

inherit rpm
