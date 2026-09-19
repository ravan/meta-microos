SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "45.2"

RPM_NAME = "librygel-renderer-gst-2_8-0-45.2-1.2.aarch64.rpm"
RPM_HASH = "3230aefeebd6dc4d3f98b40c97aada307cc567b30f794696e397ab7d2b327172e2a85adaf2a519b01cbead4a7731b12636509773a55927b10f093de833dcacc4"

RPROVIDES:${PN} += "librygel-renderer-gst-2-8-0 \
librygel-renderer-gst-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-av-1.0.so.3 \
librygel-core-2.8.so.0 \
librygel-renderer-2.8.so.0"

inherit rpm
