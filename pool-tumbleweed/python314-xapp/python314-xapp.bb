SUMMARY = "Python XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "python314-xapp-2.4.2-3.5.noarch.rpm"
RPM_HASH = "fbb02fc83647e19e4fc5a9d123443a9b21783e667d3b5c039db5752109b407738a5ac1d425f9d1c07d90fa5495b9d52756f7d7c9427d262832e9e9897eca140f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-xapp \
python314-xapp \
python3dist-python-xapp"

RDEPENDS:${PN} += "python-abi \
python314-psutil \
xdg-utils"

inherit rpm
