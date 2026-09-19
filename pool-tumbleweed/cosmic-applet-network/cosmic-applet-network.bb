SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-network-1.0.14-1.3.noarch.rpm"
RPM_HASH = "f4e27fb4fbf9a78796656de9615b63069ed38cb25646da2a5b3a9df7822c62f6dde23b9a5d05f95c8bf18b40a895ba4750a236040cf79b29f71b3486f3889bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-network"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
