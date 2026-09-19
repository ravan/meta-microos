SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-hexedit-1.38.0-42.2.noarch.rpm"
RPM_HASH = "61d732aafe258ba98f5cb72e81dbc05ac3e9dd023073839b299821513385cb9a86185c458cab4235eba815d92e56f85e5bbda906995fafe734030ad3b8533b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm
