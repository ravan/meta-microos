SUMMARY = "Theme preview application for GTK 4"
DESCRIPTION = "A widget factory is a theme preview application for GTK and Qt. It \
displays the various widget types in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the program for GTK 4."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "awf-gtk4-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "c2fff08618dc4936092be01e6654d59abea6f3f94a20620e29f6a757475e2e22a23f1df8048c5a7cdfab96092c1e124d43de1e04cfd721ac5ebd95af26b342fe"

RPROVIDES:${PN} += "awf-gtk4"

RDEPENDS:${PN} += "gtk4 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnotify \
libnotify.so.4 \
libpango-1.0.so.0"

inherit rpm
