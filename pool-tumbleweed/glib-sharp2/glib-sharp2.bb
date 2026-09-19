SUMMARY = "Mono bindings for glib"
DESCRIPTION = "This package contains Mono bindings for glib."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glib-sharp2-2.12.45-6.3.aarch64.rpm"
RPM_HASH = "45c6325ef2f8b9127f0fdf972c2da472a926d376533075ab195417e83bfa8f7d8a192fe1fdf1de94c9d589228e3d0a423ffc013d40ebb5f33fe55ca98b2b5b81"

RPROVIDES:${PN} += "glib-sharp2 \
libglibsharpglue-2.so \
mono-glib-sharp \
mono-policy.2.10.glib-sharp \
mono-policy.2.4.glib-sharp \
mono-policy.2.6.glib-sharp \
mono-policy.2.8.glib-sharp \
pkgconfig-glib-sharp-2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
mono-System \
mono-System.Core \
mono-mscorlib"

inherit rpm
