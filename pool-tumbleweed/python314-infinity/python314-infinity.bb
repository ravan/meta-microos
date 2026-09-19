SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python314-infinity-1.5-4.9.noarch.rpm"
RPM_HASH = "a8d4d065f48cb37172c61bbdb469a28613190ac422e58dfbf6f6e7e3f8e931bfe90e74670bdfe5e4c1f3225397e0fe7576dd21867d00f97b081923a739a8f384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-infinity \
python314-infinity \
python3dist-infinity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
