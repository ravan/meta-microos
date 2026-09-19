SUMMARY = "libreport's CentOS Bug Tracker workflow"
DESCRIPTION = "Workflows to report issues into the CentOS Bug Tracker."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-centos-2.17.15-1.13.noarch.rpm"
RPM_HASH = "75cf2859c580865d97b7f17f029f98560e76156db85c710d8f09e3cfe2e4fbe353c2dc97cbb90008bff6bcf7640c36be518a201f61007edfccf283dcbb2e9d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libreport-centos \
libreport-centos"

RDEPENDS:${PN} += "libreport-2 \
libreport-plugin-mantisbt \
libreport-web-2"

inherit rpm
