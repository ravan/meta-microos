SUMMARY = "A library that provides a Python 3 interface for the Gravatar API"
DESCRIPTION = "A library that provides a Python 3 interface for the Gravatar API."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python314-libgravatar-1.0.4-2.9.noarch.rpm"
RPM_HASH = "00359627dfaaa813ee592f2145dceebb3bfd518edc61bbfd2fccc7797cebbc96752d607dd1067a61ec74da1f473906923338b7d6cc6d92fb2777448be70fc49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libgravatar \
python314-libgravatar \
python3dist-libgravatar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
