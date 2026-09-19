SUMMARY = "Xfce Development Tools"
DESCRIPTION = "The Xfce development tools are a collection of tools and macros for \
Xfce developers and people that want to build unreleased development \
versions of Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.0"

RPM_NAME = "xfce4-dev-tools-4.20.0-1.7.aarch64.rpm"
RPM_HASH = "a363456d8adafa26c17303bf11b2963506954712fffa672e3aced145f432275270677c4ff378263ee70a7713541c8f38c5349bef096a8bd6b5c095f67a6adb61"

RPROVIDES:${PN} += "xfce4-dev-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
autoconf \
automake \
intltool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtool \
make"

inherit rpm
