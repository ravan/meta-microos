SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-app-list-1.0.14-1.3.noarch.rpm"
RPM_HASH = "711584409df62af7e6c02ca544131f058b7ffd221253fcf3f8614bec8303cf47222403aba5731b04e02a265ddfbf89b4118c7297f3d3117cbf22222308255d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-app-list"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
