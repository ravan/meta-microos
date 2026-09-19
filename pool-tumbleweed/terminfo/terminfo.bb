SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "6.6.20260815"

RPM_NAME = "terminfo-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "a3c74cf769c851a228e3dc4235edd6469d6464bb053375aca018f3f2f90d5c2a1aa44e5ade1e99256023d6e2ddf77db0fe89f96abddfe32f0fe25ea28bb1e433"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
