SUMMARY = "Remote User Interface handling library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the ruih library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-ruih-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "90280e91c83ab3c4a11a82f2b07b9f8f30756e7f7791fd69ec5f5243371f225ec426938535abb555d4e98df2b2078275b8828bd0896d9f0c409bfa382bfdf61c"

RPROVIDES:${PN} += "librygel-ruih-2-8-0 \
librygel-ruih-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-1.6.so.0 \
librygel-core-2.8.so.0 \
libxml2.so.16"

inherit rpm
