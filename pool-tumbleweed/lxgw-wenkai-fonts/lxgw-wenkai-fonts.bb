SUMMARY = "An open-source Chinese font derived from Fontworks' Klee One."
DESCRIPTION = "An open-source Chinese font derived from Fontworks' Klee One."
LICENSE = "OFL-1.1"

PV = "1.300"

RPM_NAME = "lxgw-wenkai-fonts-1.300-1.9.noarch.rpm"
RPM_HASH = "edb4415020a5fd1c4234c2246787c7bd70efd4261d517cf5df2e51b710c5fd3e292642857c4d5f20fa2d9468000e761e9d07d9867d08f34d8d5db93af91c50d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
