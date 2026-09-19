SUMMARY = "Systemd-repart service dracut module"
DESCRIPTION = " \
Dracut module which is calling systemd-repart before encryption."
LICENSE = "MIT"

PV = "1+git20260730.6c531e2"

RPM_NAME = "systemd-repart-dracut-1+git20260730.6c531e2-1.1.noarch.rpm"
RPM_HASH = "897afec40d2633226014b052da6cae712985531295cbceeb51bf224d595119bb6a27a1a63748ae34bb01a21267ed2135ebbaf6bc5fdf4918d855a9e19d1baa18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-repart-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
systemd"

inherit rpm
