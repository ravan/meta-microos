SUMMARY = "Library with X keyboard related functions"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier16-5.4-2.11.aarch64.rpm"
RPM_HASH = "d7a4d6b300eb40309ce93e0d30ed7e6d90494aed65dc6b885f6e686f3fab44712bdc9f7effa6337e7b3c4029954d639fdba432d1b8783bd71197b39412d5950f"

RPROVIDES:${PN} += "libxklavier \
libxklavier.so.16 \
libxklavier16"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxkbfile.so.1 \
libxml2.so.16"

inherit rpm
