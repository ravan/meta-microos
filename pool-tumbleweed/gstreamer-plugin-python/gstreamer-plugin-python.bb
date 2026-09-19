SUMMARY = "GStreamer 1.0 plugin for python"
DESCRIPTION = "This module contains a wrapper that allows GStreamer applications to be \
written in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.6"

RPM_NAME = "gstreamer-plugin-python-1.28.6-1.1.aarch64.rpm"
RPM_HASH = "58f4d72a12e3e774acb21d0e53deaf2fcea48b48d6c107ae163f0b01a36d4436f20ffbb8912da823c5306b85539843e8d54254a4041eb099b9cee2824896c925"

RPROVIDES:${PN} += "gstreamer-plugin-python \
libgstpython.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpython3.13.so.1.0 \
typelib-GES \
typelib-GLib \
typelib-GObject \
typelib-Gst"

inherit rpm
