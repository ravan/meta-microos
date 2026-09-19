SUMMARY = "Core library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the core library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-core-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "e6785effcedc45cc2ba9976b1a87fb6619dd808bd723eae8430603f4b6b27d9622753c893c58374816e67853aaec23db155ef2ac65c0c88d602f4a8fb317b2ef"

RPROVIDES:${PN} += "librygel-core-2-8-0 \
librygel-core-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libxml2.so.16"

inherit rpm
