SUMMARY = "Complementary plugins for gstreamer-plugins-good"
DESCRIPTION = "This package provides complementary plugins for \
gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-good-extra-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "448e78472d1cd642581d0ba94b108d308eb8682a84ff5c06db074bf9d929086a43eac77bf48c4130e0a57b54f6474fb2c875eb823ff65d5542b2fc902ee3c17f"

RPROVIDES:${PN} += "gstreamer-plugins-good-extra \
gstreamer1 \
libgst1394.so \
libgstcacasink.so \
libgstcairo.so \
libgstdv.so \
libgstmonoscope.so \
libgstshout2.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libavc1394.so.0 \
libc.so.6 \
libcaca.so.0 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdv.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libiec61883.so.0 \
libraw1394.so.11 \
librom1394.so.0 \
libshout.so.3"

inherit rpm
