SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-status-area-1.0.14-1.3.noarch.rpm"
RPM_HASH = "3cec9f68955c27a49195e2b116d09cdc1787a3f9e684f01a536ed722b1699a63cd812bd3e27b898283465eae41a73a3331807f242ae583e2ef45c86a3094cb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-status-area"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
