SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python313-retry-0.9.2-4.9.noarch.rpm"
RPM_HASH = "d583e745b204838260dc55e83d2b44176e6025a74a97a6a1cc75942d7b2c77564c49e75fdfefc0662a8dc83e678c95871bbd83fe059dafab26b6d1afdbea7ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-retry \
python3.13dist-retry \
python313-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python313-decorator"

inherit rpm
