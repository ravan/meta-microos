SUMMARY = "Standalone binfmt_misc support for Windows"
DESCRIPTION = "Standalone variant for running Windows(tm) executables out of the box. \
This package does not depend on systemd and dbus, which may not be \
available on obs workers for example."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-standalone-1.2.1-2.3.noarch.rpm"
RPM_HASH = "889ec28819e91d0127f65d165cc5b81b7c5599123a330fdddc036be0a085ee84c81ce8d5ff1207c09227d7b99ed519665a1d07100bacf827143fccb775a3302f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt-standalone"

RDEPENDS:${PN} += "wine-binfmt"

inherit rpm
