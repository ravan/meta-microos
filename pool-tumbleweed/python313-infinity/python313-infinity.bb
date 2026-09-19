SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python313-infinity-1.5-4.9.noarch.rpm"
RPM_HASH = "a3852b701a99f758f684369d30c846830c007101a18e768460b68c5bc7237f71b954f2e82fb6491bd85165e79974ce4e3cc6702e52b9b36b2f99e82088c8e5cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-infinity \
python3.13dist-infinity \
python313-infinity \
python3dist-infinity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
