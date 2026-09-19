SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkdecorations3private2-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "9784ab9cf226355b3b2e2e506327c33efcf8ed18d004d00e8bf0db7059909fded4d950b9c4bcef6c9e94b22e9f270e09b4cf75321de650d2532112ff62ab21b8"

RPROVIDES:${PN} += "libkdecorations3private.so.2 \
libkdecorations3private2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
