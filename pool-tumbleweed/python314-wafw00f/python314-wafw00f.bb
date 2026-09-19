SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "python314-wafw00f-2.4.2-1.2.noarch.rpm"
RPM_HASH = "2b905d1905ead643a1f51f5c842812c20f160ee8ab4eb6ebe770c684582a61fd3ebc5e202aa47738263f0ee3ea6d11705acc94cb8544fe13e6be1175168cc143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wafw00f \
python314-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-requests"

inherit rpm
