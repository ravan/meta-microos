SUMMARY = "Gcin qt5 immodule"
DESCRIPTION = "gcin qt5 immodule, support Qt5-based applications"
LICENSE = "GPL-2.0-only"

PV = "2.9.0"

RPM_NAME = "gcin-qt5-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "7bb09292d8d05bd8f4457566cd668a8a5a09c3d3ea95bc6b1de88108ee6a44de36f45a7d2e695d7802833336569bb3ecf5eccb0a5468609f5fd0158ffce134c1"

RPROVIDES:${PN} += "gcin-qt5 \
gcin-qt5-immodule \
libgcinplatforminputcontextplugin.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgcin-im-client.so.1"

inherit rpm
