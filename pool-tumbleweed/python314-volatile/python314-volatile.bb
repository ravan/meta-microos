SUMMARY = "Python extension for the tempfile module"
DESCRIPTION = "A small Python extension for the tempfile module."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-volatile-2.1.0-2.5.noarch.rpm"
RPM_HASH = "d37ddeefe696a6deaddaaaabdd0b81e5bf12fa5e7dfb964351793c2da522592878692a0d706a97f4e50a5be508cb54def7452c63131717e1f34689fe1c589470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-volatile \
python314-volatile \
python3dist-volatile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
