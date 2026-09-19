SUMMARY = "Documentation for PCB, An interactive printed circuit board editor"
DESCRIPTION = "This package contains the documentation of PCB, an interactive printed circuit \
board editor."
LICENSE = "GPL-2.0-only"

PV = "4.3.0"

RPM_NAME = "pcb-doc-4.3.0-1.22.noarch.rpm"
RPM_HASH = "4fb8731672b8593f523d201b340588f32008cc4f39685626f112a4c7fe72ebfe9ed31d5dd0f55d97739764f63da16439fa411e9685711eeb734a83f648c37556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcb-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
