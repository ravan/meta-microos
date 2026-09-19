SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "4.11.7"

RPM_NAME = "python314-platformdirs-4.11.7-1.1.noarch.rpm"
RPM_HASH = "901c367a766ab10b8608361468b5428a1f5d208872b0767c2d5e7a0466ad13a41727b8c0b181b005d2a0012c1a57fc638ffa6a2263165ee8a9fdaa819a15bac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-platformdirs \
python314-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
