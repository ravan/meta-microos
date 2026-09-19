SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-tiling-1.0.14-1.3.noarch.rpm"
RPM_HASH = "79d97ac5b908f927237846ea1e45c9c9daba10d3ef46c413be3eee4f3beff49646983be256220510f5a4dcf402b7d4e83b05763df34b13c8788790d10b28ed38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-tiling"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
