SUMMARY = "Library providing an interface atop libsolv"
DESCRIPTION = "This library provides an interface atop libsolv, and a high-level \
RPM package manager library interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "libdnf2-0.75.0-1.3.aarch64.rpm"
RPM_HASH = "6012fb34f377e4b864f20e536139d2544967a18a54d0fec22e52616198f825f2ed74819e4898790da4dc5204aafa85bf1ae4361e246e5e3de8d22b8ccc2ce5de"

RPROVIDES:${PN} += "libdnf.so.2 \
libdnf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-c.so.5 \
libmodulemd.so.2 \
libmodulemd2 \
librepo.so.0 \
librepo0 \
librpm.so.10 \
librpmio.so.10 \
libsmartcols.so.1 \
libsolv.so.1 \
libsolvext.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
