SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "84f6ac2976df81fda435a4e4344adf63de37f303a61433127456c153f8f3149fabba9708e85eee76d8ead5640812126a9c0a11108b058dec55c46846895ed8dd"

RPROVIDES:${PN} += "gstreamer-plugins-bad-chromaprint \
gstreamer1 \
libgstchromaprint.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchromaprint.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
