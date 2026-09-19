SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.2.4"

RPM_NAME = "python314-billiard-4.2.4-2.2.noarch.rpm"
RPM_HASH = "e5ed2de0a1b769b8409f5348b1eba36763f658a71bead63a189497340fa325228a208ee218a6d589ed3f4b586908ddfccd209089ef660d505e9336bdc107e571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-billiard \
python314-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
