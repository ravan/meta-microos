SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.25.0"

RPM_NAME = "python314-pan-python-0.25.0-1.4.noarch.rpm"
RPM_HASH = "bb3d40df898c987267fb332e8e5ded3ae8d085ab744e5b8fcc0e7434b42f43874b0459360a51ba4b468e789aa108e2853ac2c482cc49f006a9a9b051d517c43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pan-python \
python314-pan-python \
python3dist-pan-python"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
