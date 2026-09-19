SUMMARY = "Graphical Interface for highlight"
DESCRIPTION = "This package provides graphical interface for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-gui-4.18-1.6.aarch64.rpm"
RPM_HASH = "4a1c6ee32cf664f8e46124d118d2ab3ff985321500e11b20c03baa7e0f5ea2aee060a49ccb61a6e27b948bb3a5500f29de2c23cd2d4e66dc213ee751d1c7ac2f"

RPROVIDES:${PN} += "highlight-gui"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
