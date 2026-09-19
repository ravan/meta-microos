SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-hostname-1.38.0-42.2.noarch.rpm"
RPM_HASH = "5cb1a21f1ac8d2e4580d86664ad5db26a2aa02c596de69079cf870fc0254ae7fce0f78c0d6de606e91306f8c32c789001e2db0783bdcaa34103ab6e9b3cd28bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/hostname \
busybox-hostname"

RDEPENDS:${PN} += "busybox"

inherit rpm
