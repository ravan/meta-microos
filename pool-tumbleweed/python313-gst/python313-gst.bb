SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.6"

RPM_NAME = "python313-gst-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "9416f846bdcdfa626666b24734b5d50104465375381419fac0499ee0cf48116d03509b28570fc3d0e852cd26c2eb852a330d0266d4101605cf76e2bed458321f"

RPROVIDES:${PN} += "python3-gst \
python313-gst"

RDEPENDS:${PN} += "gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstanalytics-1.0.so.0 \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gst \
typelib-GstAnalytics \
typelib-GstApp \
typelib-GstAudio \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
