SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-sysvinit-tools-1.38.0-42.2.noarch.rpm"
RPM_HASH = "a60232ce2ac3c0749c864a7cd01f160a73533e21e06486b85804caee48b6873ba760266bd5ec3d2298f472b40ec2e11495333d6a39ef0e6bdbd666bba5717f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
