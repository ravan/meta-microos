SUMMARY = "GTK+ 4.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 4.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "fcitx5-gtk4-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "33b17b635f9a124ca56c62ee2e13e50762bbd6c22aef6fb9bc5634105b0571ffc8ab671f1553cf88083017ac0916c487614316159ef40fcbc41eaba7bf1d7e4b"

RPROVIDES:${PN} += "fcitx5-gtk4 \
libim-fcitx5.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
