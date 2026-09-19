SUMMARY = "Libraries for appstream compose support"
DESCRIPTION = "The library for AppStream compose support."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "libappstream-compose0-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "b45d36e05bf8157c5cf8e258728927ad366c2c435f0663ae150488902d46be545881cd85c29bd00510e06b21481b9358c311c66172238a990cc02db64f43d6c8"

RPROVIDES:${PN} += "libappstream-compose.so.0 \
libappstream-compose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libappstream.so.5 \
libblake3.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfyaml.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
