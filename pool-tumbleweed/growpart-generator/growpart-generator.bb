SUMMARY = "Grow a partition automatically"
DESCRIPTION = "This systemd generator implements the 'x-growpart.grow' mount options in /etc/fstab \
allowing to grow the referenced partition to its maximum size. \
It behaves like 'x-systemd.growfs' and is usually used in combination with that."
LICENSE = "GPL-3.0-only"

PV = "0.9"

RPM_NAME = "growpart-generator-0.9-1.3.noarch.rpm"
RPM_HASH = "07d8b1e6f2d7a6c68c9034eefa8c2a3b21317c2201e13d2bc98f01138615354fcda1830a83ea0d3109ae5a495468e7c5546b48c531e4730654c28b5aac76dd79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "growpart-generator"

RDEPENDS:${PN} += "/usr/bin/sh \
growpart \
systemd"

inherit rpm
