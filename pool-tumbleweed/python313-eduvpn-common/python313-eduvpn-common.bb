SUMMARY = "Python wrapper for eduVPN shared library"
DESCRIPTION = "The python wrapper for the eduVPN common Go shared library."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python313-eduvpn-common-5.0.3-1.1.noarch.rpm"
RPM_HASH = "11819bd09bb32ea64c3eb8b7d6ed0244adb184e5cd31270f6c7e96e62b3fa36d2eb8b5e90bea0d35c2b656a68380de4711ad5cc836daca1aa6a2408d65205ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eduvpn-common \
python3.13dist-eduvpn-common \
python313-eduvpn-common \
python3dist-eduvpn-common"

RDEPENDS:${PN} += "eduvpn-common \
python-abi"

inherit rpm
