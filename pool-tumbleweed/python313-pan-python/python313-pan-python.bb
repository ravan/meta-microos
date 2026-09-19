SUMMARY = "Multi-tool set for Palo Alto Networks PAN-OS, Panorama, WildFire and AutoFocus"
DESCRIPTION = "pan-python is a Python package for Palo Alto Networks' Next-Generation \
Firewalls, WildFire and AutoFocus.  It provides: \
 - a Python and command line interface to the PAN-OS and Panorama XML API \
 - a command line program for managing PAN-OS XML configurations \
 - a Python and command line interface to the WildFire API \
 - a Python and command line interface to the AutoFocus API"
LICENSE = "ISC"

PV = "0.25.0"

RPM_NAME = "python313-pan-python-0.25.0-1.4.noarch.rpm"
RPM_HASH = "9419d8c8f7ca87e28526206c787d61d6474c1ec83d8189f29b51b576bb15c03480cfe504307fdf10c20be4d0bde3633a678a3afd77252659f2630fdb53a2a203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pan-python \
python3.13dist-pan-python \
python313-pan-python \
python3dist-pan-python"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
