SUMMARY = "Python interface for rpmconf"
DESCRIPTION = "Python interface for rpmconf and an essential part of rpmconf."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.12"

RPM_NAME = "python3-rpmconf-1.1.12-1.2.noarch.rpm"
RPM_HASH = "5b0eb8b9e9e79f2448f4abb674b9bf1c902c864fef8898fc489b7a43086d542cc254742b1f9abf2110a9d47f4d5bbbd7eac9ed8e547da573ebfb7fe07ec4fb65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmconf \
python3.13dist-rpmconf \
python3dist-rpmconf"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
