SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sharutils-1.38.0-42.2.noarch.rpm"
RPM_HASH = "d78382f48a1429d0039655706abbf3ab7984e1d911bc195fc73403af6e540b85a84a0108555e891d887e3c81fbb539eced2d5c23addbcdf980fbf9cd7049ef00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
