SUMMARY = "GStreamer Plug-Ins for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "gstreamer-plugins-farstream-0.2.9+5-3.3.aarch64.rpm"
RPM_HASH = "1e2cd5635af07f87fa49f5b619c701171d38e5b55a267a86fcad7ba86a5b6878876a2bbe0d3bd75042500c846c18f0cd4d4ed76571b5ebd4d8252af0645168b6"

RPROVIDES:${PN} += "gstreamer-plugins-farstream \
libfsrawconference.so \
libfsrtpconference.so \
libfsrtpxdata.so \
libfsvideoanyrate.so"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfarstream-0.2.so.5 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libm.so.6"

inherit rpm
