SUMMARY = "Introspection bindings for the GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the introspection bindings for the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "typelib-1_0-GstTranscoder-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "c3ecf1bde5d3deefd78e37af1af8ba192276b5673d97073de442873e567b176812f951e0ee7582b0767e582b8805b3f5a87e8dcbe6e84344b4b17490f389658a"

RPROVIDES:${PN} += "typelib-1-0-GstTranscoder-1-0 \
typelib-GstTranscoder"

RDEPENDS:${PN} += "libgsttranscoder-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
