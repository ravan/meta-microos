SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-workspaces-1.0.14-1.3.noarch.rpm"
RPM_HASH = "a69908bc76761bd91156cfa6df17f4ec97f080ed359ec9086475714fdb2d6019312de85abcf04024f7c077ece12e05b304be32722e4e49fcb6b1ce14b64837a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-workspaces"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
