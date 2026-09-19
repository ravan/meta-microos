SUMMARY = "Busybox applets replacing man"
DESCRIPTION = "This package contains the symlinks to replace man with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-man-1.38.0-42.2.noarch.rpm"
RPM_HASH = "ce3cb9ca4b34f43fcfc0fb22e1a5bcdb226f9193f928c9269dd6f3474d9d0d8680f62bce9b2ff0ba6e770492fb9948351c5c45fd297ad97b40c5f6a9960d9bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-man"

RDEPENDS:${PN} += "busybox"

inherit rpm
