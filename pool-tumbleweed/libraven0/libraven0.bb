SUMMARY = "Shared library for Raven"
DESCRIPTION = "Budgie Desktop Notification Center."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libraven0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "fae284c561f889c7d0b668f712a61c30a086aaa7ccb24147d6f410e00b387c92e9da9763482663169f28e2e7f614fec575f2ca89d0d598d1b7b884dcfa1390bc"

RPROVIDES:${PN} += "libraven.so.0 \
libraven0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-private.so.0 \
libbudgie-raven-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpeas-2.so.0 \
libuuid.so.1 \
libxfce4windowing-0.so.0"

inherit rpm
