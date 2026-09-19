SUMMARY = "Python classes for name-to-object registry-like support"
DESCRIPTION = "A Python library providing classes for name-to-object registry-like support."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2"

RPM_NAME = "python314-catalogus-0.1.2-1.1.noarch.rpm"
RPM_HASH = "37c436b4c69347431ced8c518e212a85ab76b9652971efbdfd529f1c1a455e446906e9a927c4befd878c4cb12ab469bf2a4b5e71c8b592ffc71acc14b2e030c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-catalogus \
python314-catalogus \
python3dist-catalogus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
