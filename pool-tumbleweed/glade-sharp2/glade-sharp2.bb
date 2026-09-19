SUMMARY = "Mono bindings for glade"
DESCRIPTION = "This package contains Mono bindings for glade."
LICENSE = "LGPL-2.1-only"

PV = "2.12.45"

RPM_NAME = "glade-sharp2-2.12.45-6.3.aarch64.rpm"
RPM_HASH = "256f8b46ddfc491ef7ac380937e900dd9a7dc8541daf31b0657f5c0b2295251fefda3dde2d1d34113c2cd790eb5fc5159db4cbaed1eb413a44e085734dcb3911"

RPROVIDES:${PN} += "glade-sharp2 \
libgladesharpglue-2.so \
mono-glade-sharp \
mono-policy.2.10.glade-sharp \
mono-policy.2.4.glade-sharp \
mono-policy.2.6.glade-sharp \
mono-policy.2.8.glade-sharp \
pkgconfig-glade-sharp-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglade-2-0-0 \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
pkgconfig-gtk-sharp-2.0"

inherit rpm
