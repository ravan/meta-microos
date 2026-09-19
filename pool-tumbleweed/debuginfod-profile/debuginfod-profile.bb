SUMMARY = "Profile files for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The debuginfod-profile package contains a profile files that set default \
URL for a distribution."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "debuginfod-profile-0.194-1.2.aarch64.rpm"
RPM_HASH = "d80fd8a5134fc5bcde23e2ad0c0c6e039a0b6ea5c242dffba4c9d121b537ab406e18c0a6eea8d88e67e5172d6259139ec8896f8df04eaa5564d2364824f91436"

RPROVIDES:${PN} += "config-debuginfod-profile \
debuginfod-profile"

RDEPENDS:${PN} += ""

inherit rpm
