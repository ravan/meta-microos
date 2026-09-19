SUMMARY = "GTK+ 2.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 2.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "fcitx5-gtk2-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "b912aaaef9d40f4b50116e47eac0d2e0c80f684078f88d80f7e48c82f94ffe82e446717add97cc568646916a368f2f33929d81db92d650c1ff0f1caf74131298"

RPROVIDES:${PN} += "fcitx-gtk2 \
fcitx5-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-tools \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
