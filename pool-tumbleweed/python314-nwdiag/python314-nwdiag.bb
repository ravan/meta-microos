SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python314-nwdiag-3.0.0-3.5.noarch.rpm"
RPM_HASH = "1240d3d80ebc694441625b2854cb0e2e38f2ccbf0a1f65270402bfc050c77f37d1cb0b3396d62abf7db1933948a2872dd5e0cf7ea691b3b4ad0b0f5760f73a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nwdiag \
python314-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-blockdiag \
python314-setuptools"

inherit rpm
