SUMMARY = "Qt 6 XDG Desktop Portal Plugin"
DESCRIPTION = "Qt 6 plugin for integration with Flatpak and Snap."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-platformtheme-xdgdesktopportal-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "82d1b61fbd4b9963fe4d1ea3e4a585c950c4c2ec73a86563e45f412e9966846e5c485f2ba0bc858d54d2fa1b8772102449ab6df66731223a9fb69751abb10e0b"

RPROVIDES:${PN} += "libqxdgdesktopportal.so \
qt6-platformtheme-xdgdesktopportal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
