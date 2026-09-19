SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python314-parameterized-0.9.0-5.5.noarch.rpm"
RPM_HASH = "0db8b5d674fa41ee5109ccd3609eaa2d78da1663adad81a06523604ee54b4e5a026a228282fcf291ff1c4f96ed04fcf3bcdb80f35b1538774c2ea62efc4a56ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parameterized \
python314-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
