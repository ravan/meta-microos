SUMMARY = "Openbox Render Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
for theme rendering."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobrender32-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "22900d7b1f51e17040553ed11e06b69e028c7a77ec4656534f47376caccb7b537ee2f379cd4a1b4421b6a25c8447e306a9ca9bc5da045876fa263fe49e9853f4"

RPROVIDES:${PN} += "libobrender.so.32 \
libobrender32"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libobt.so.2 \
libpango-1.0.so.0 \
libpangoxft-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
