SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python314-uhashring-2.5-1.1.noarch.rpm"
RPM_HASH = "b33960edfd1994cf53c1c800a54cca958ac02738ca06f6ce85f861ba45fc44bfabc53522b665e95ab49f1870f02b9d4ea30bef96efaf435e3f1c3720784300cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-uhashring \
python314-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
