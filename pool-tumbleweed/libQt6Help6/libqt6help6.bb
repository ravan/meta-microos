SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "libQt6Help6-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "784191bdc4d2565783229e8c91f345db476417c3785ad21f3c8a5c95f71e4ae2734243da7fb96ca39baa8975430ed89c361310f1deb328061baa2bbd444945ab"

RPROVIDES:${PN} += "libQt6Help.so.6 \
libQt6Help6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
