SUMMARY = "Grantlee theme support"
DESCRIPTION = "the grantleetheme library adds Grantlee theme support for PIM applications."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "grantleetheme-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "92c52e297b6a1d67520f2910a465045a742cc6d32962f3a3f92eaa0f9c2e25fba00cd301fe2853d574414b4c7e50db72ca668cf6e61be18fbe07722c43eae939"

RPROVIDES:${PN} += "grantleetheme"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6GuiAddons.so.6 \
libKF6IconThemes.so.6 \
libKF6TextTemplate.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
