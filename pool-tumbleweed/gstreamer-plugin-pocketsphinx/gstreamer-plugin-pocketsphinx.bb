SUMMARY = "GStreamer Plugin for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides the GStreamer plugin for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5.0.3+git20241211.69167fb"

RPM_NAME = "gstreamer-plugin-pocketsphinx-5.0.3+git20241211.69167fb-1.7.aarch64.rpm"
RPM_HASH = "f019a728c57609069ad42ffcd3c273ae5d4099822e80b49dd7796662af334d8e800480063eca7f7859e79b1ad27c42283c2b887a06c7dd5b6fcebd59f2b496c1"

RPROVIDES:${PN} += "gstreamer-plugin-pocketsphinx \
gstreamer1 \
libgstpocketsphinx.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libpocketsphinx.so.5 \
pocketsphinx"

inherit rpm
