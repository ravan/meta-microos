SUMMARY = "GTK+ 3.0 im module for fcitx5"
DESCRIPTION = "This package provides GTK+ 3.0 im module for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.5"

RPM_NAME = "fcitx5-gtk3-5.1.5-1.4.aarch64.rpm"
RPM_HASH = "15fc225985926780b2c099f97d6e41e4c93184c41b6adc5d8b9f66db36841985e9e52975471e838533a21c70ed22f93ea9190436f21001e63d60cac9b1f06860"

RPROVIDES:${PN} += "fcitx-gtk3 \
fcitx5-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
