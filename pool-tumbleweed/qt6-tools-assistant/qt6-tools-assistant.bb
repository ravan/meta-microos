SUMMARY = "Documentation browser"
DESCRIPTION = "Qt Assistant is a tool for viewing documentation in Qt help file format."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-assistant-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "1b3d9a6f8ed5eba32c48dcee15015b9dedac48a53e15196d8a8105ec55bbeb036b44cb9d3fb3f63caa1499914ceec6eaabf804369e83841cf4d9a85788fca2bb"

RPROVIDES:${PN} += "libhelpplugin.so \
qt6-tools-assistant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
