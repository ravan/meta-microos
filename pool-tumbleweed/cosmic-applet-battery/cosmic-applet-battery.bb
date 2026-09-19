SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-battery-1.0.14-1.3.noarch.rpm"
RPM_HASH = "c96feeced8c8ecdd9939a1b6383afa641143290328adff48b8bc3f067f76ff4f1b9118e029bc493048d42c6c00c5a621d23bbb13064e5b732c1dd76479c1f5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-battery"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
