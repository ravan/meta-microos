SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python314-mohawk-1.1.0-6.5.noarch.rpm"
RPM_HASH = "e09d9f19d821fafa55999ebbf91fedd8c4a6c8e209fde73d65466a0a2c9cd64a331ab90e4c7bbfd856702982cd71c63c7a7866474c3d0b0a25b318a365b9518f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mohawk \
python314-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
