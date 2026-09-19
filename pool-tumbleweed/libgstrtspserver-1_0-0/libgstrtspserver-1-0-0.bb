SUMMARY = "GStreamer-based RTSP server library"
DESCRIPTION = "Library on top of GStreamer for building an RTSP server - Library files."
LICENSE = "LGPL-2.0-or-later"

PV = "1.28.6"

RPM_NAME = "libgstrtspserver-1_0-0-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "64ce441b343b8e593f6ca437e5c18c5e0500fabc4f12c5646bb0c1626aebf3554063a68d8584534178e8977495548b84584f67c2949d997cdd10e05d9aca1465"

RPROVIDES:${PN} += "libgstrtspserver-1-0-0 \
libgstrtspserver-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgstvideo-1.0.so.0"

inherit rpm
