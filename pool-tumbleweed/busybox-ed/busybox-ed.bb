SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-ed-1.38.0-42.2.noarch.rpm"
RPM_HASH = "004cd4c6357895b67b0cdafa10a861b9ecbf2f289e1778c1586a9c4f87f23a338fc9f8df55144044573e6d6348e75f3ae49aa68dba6d173be91744f14705bcfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"

RDEPENDS:${PN} += "busybox"

inherit rpm
