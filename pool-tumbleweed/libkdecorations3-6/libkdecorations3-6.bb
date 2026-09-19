SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkdecorations3-6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "7ffd484664c8955fd2dca606ad0a2a2d32897e36fd8175ce00b703ce936ec8218788d5d0a7559f1cfc41cc657031765d0d669c7f7eb74a0800c4712a1ee50d74"

RPROVIDES:${PN} += "libkdecorations3-6 \
libkdecorations3.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libkdecorations3private.so.2 \
libstdc++.so.6"

inherit rpm
