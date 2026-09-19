SUMMARY = "Tools for exo"
DESCRIPTION = "This package provides tools and helpers for exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.0"

RPM_NAME = "exo-tools-4.20.0-2.8.aarch64.rpm"
RPM_HASH = "dd9c3b5293a19c19e1c168a8cd5076d4e3acc3f8e9e803988667c491a9fe1f194d27d79ab4952340667983539bb5ce445b821efef5657c66618be2f466c4adc6"

RPROVIDES:${PN} += "exo-/usr/bin/exo-desktop-item-edit \
exo-/usr/bin/exo-open \
exo-/usr/bin/exo-preferred-applications \
exo-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
