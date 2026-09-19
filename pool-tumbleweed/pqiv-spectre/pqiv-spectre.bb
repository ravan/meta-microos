SUMMARY = "Backend spectre for pqiv"
DESCRIPTION = "Backend spectre for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-spectre-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "0a798f7819dfa201875feada21bcfb5c2fd68eda2238beb267ffb86551f3762de17f04a7f5994772a2f006fcde1537dd3450bb3c7f14544c6168e644469c5ba1"

RPROVIDES:${PN} += "pqiv-spectre"

RDEPENDS:${PN} += "libcairo.so.2 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libspectre.so.1 \
pqiv"

inherit rpm
