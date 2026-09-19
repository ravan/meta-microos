SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "libgstsctp-1_0-0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "1562aacefe0d3aaa18af856d083010dc46e982366952ef9109ebc738164e8b63a68205662c4fa0282b2e8fb099345f9ec2016b6837072e8ed1efaceffe0b1ab6"

RPROVIDES:${PN} += "libgstsctp-1-0-0 \
libgstsctp-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
