SUMMARY = "GTK+-3.0 Hangul Input Modules"
DESCRIPTION = "GTK+-2.0 Hangul input modules."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1+git20130112.a4c2796"

RPM_NAME = "imhangul-3.1.1+git20130112.a4c2796-4.10.aarch64.rpm"
RPM_HASH = "64c954efdb50b4f158b469c18617bf034ae5659396cc3461a154a832d10e45f72f89552fdec7ce69ac0b7b94a2ea174003026182fd7cab234052396a324fccd3"

RPROVIDES:${PN} += "imhangul \
locale-gtk3-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhangul.so.1 \
libpango-1.0.so.0"

inherit rpm
