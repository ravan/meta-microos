SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-launcher-button-1.0.14-1.3.noarch.rpm"
RPM_HASH = "53997fbc052d4fb45bb2d9f10f97a5b6f74544643d7663af915490af31f9d747f8ce9fe814168416996d018ea8ea96b9169156f576e006a2ee5d0b93920724d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-launcher-button"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
