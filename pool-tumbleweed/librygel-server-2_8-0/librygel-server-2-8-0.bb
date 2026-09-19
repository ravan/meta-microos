SUMMARY = "Server library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the server library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-server-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "64491d5934b36428e53ecbe9abdca12acefe9d73dc826cd05abca929cbd456c44fc1905703ccb5e8462ceb77b7a5e7b3e53b7357f1ca53abc0eb91cadb631004"

RPROVIDES:${PN} += "librygel-server-2-8-0 \
librygel-server-2.8.so.0"

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
libgupnp-av-1.0.so.3 \
libmediaart-2.0.so.0 \
librygel-core-2.8.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
