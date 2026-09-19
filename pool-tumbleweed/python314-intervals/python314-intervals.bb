SUMMARY = "Python tools for handling intervals"
DESCRIPTION = "Python tools for handling intervals (ranges of comparable objects)."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python314-intervals-0.9.2-3.5.noarch.rpm"
RPM_HASH = "b3f2b54ca6b41a6993b67221d7d2ab9a07ec2fce586ac9450119a08de63ba5139b4c2620e72cfb9fa598136705b9325c51c66af499ed1cbddff2926bad4c812c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-intervals \
python314-intervals \
python3dist-intervals"

RDEPENDS:${PN} += "python-abi \
python314-infinity"

inherit rpm
