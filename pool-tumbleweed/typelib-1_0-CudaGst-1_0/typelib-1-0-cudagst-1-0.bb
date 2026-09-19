SUMMARY = "Introspection bindings for GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "b4861914574a5a49aa865af707605c22122d2c15c0afcbdf496d3fe4f1c69610c0fd55a9c307edb47ede924a1b3119f86db8c471a4d0f03180fcf694789fe33e"

RPROVIDES:${PN} += "typelib-1-0-CudaGst-1-0 \
typelib-CudaGst"

RDEPENDS:${PN} += "libgstcuda-1.0.so.0"

inherit rpm
