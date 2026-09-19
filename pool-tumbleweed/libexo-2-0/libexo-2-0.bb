SUMMARY = "Application Development Library for Xfce"
DESCRIPTION = "Exo is an extension library to Xfce which is targeted at application \
development."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.0"

RPM_NAME = "libexo-2-0-4.20.0-2.8.aarch64.rpm"
RPM_HASH = "71e3e63f9f8e33b8aad9817ab3d6a18541e1fdbc61281e7be7a0744cf2cf5c99035e8a017fda69f12084ecf2e0b079f01442f1aee403b8e749887ea97f1bdb59"

RPROVIDES:${PN} += "libexo-2-0 \
libexo-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
exo-data \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4util.so.7"

inherit rpm
