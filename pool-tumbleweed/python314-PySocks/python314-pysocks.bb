SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python314-PySocks-1.7.1-3.5.noarch.rpm"
RPM_HASH = "a2fbd166c4892f21f47a2f9acd219f0e69dc31afcc8c49e00f001280e12caf22c16fa1b2977e7bb39f91641ac418ee5d17eae03f551fe7e36200d4be45b3f02b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysocks \
python314-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
