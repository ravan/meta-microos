SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "libgstreamermm-1_0-1-1.10.0-6.21.aarch64.rpm"
RPM_HASH = "8f2802c757a01d43791a9c0e28b822228f12004af7795e85c5907942238a206becb5912a35f2111d5eff8e94020e4881f183d1836cd0a233ce4670a2a7022739"

RPROVIDES:${PN} += "libgstreamermm-1-0-1 \
libgstreamermm-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgstvideo-1.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
