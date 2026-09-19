SUMMARY = "MATE Desktop file sharing for the masses"
DESCRIPTION = "mate-user-share is a small package that binds together various \
free software projects to bring easy to use user-level file sharing \
to the masses."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-user-share-1.28.0-2.4.aarch64.rpm"
RPM_HASH = "daadc77445bdb37678b3d2902b66a2e7f85e85dfa0180d5c1edb17f56350322476027b2589a074836860c8fed85cd6b6c63005c0c5b5ae416722e4d2a35de758"

RPROVIDES:${PN} += "config-mate-user-share \
libcaja-user-share.so \
mate-user-share"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcaja-extension.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libselinux.so.1"

inherit rpm
