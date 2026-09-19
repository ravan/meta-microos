SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-kmod-1.38.0-42.2.noarch.rpm"
RPM_HASH = "4f19a0207cf6d83a61cd8a4c28f0ddf66998ed6d75c152e1475f8264448f7df197e2d7a90380d1eacc24d63acce2a6851f8e9e435b3a8890da15494bc3791841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
