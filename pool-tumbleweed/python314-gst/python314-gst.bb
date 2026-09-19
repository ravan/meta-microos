SUMMARY = "Python Bindings for GStreamer"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.6"

RPM_NAME = "python314-gst-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "266b764e58bc235c1e8c0510c355a064d0f00730d83ec39b9e3dcc668578a7ac74a409dc8d7fa0935925951849705d37487186f560dba00a8a38e8f68534e25c"

RPROVIDES:${PN} += "python314-gst"

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
