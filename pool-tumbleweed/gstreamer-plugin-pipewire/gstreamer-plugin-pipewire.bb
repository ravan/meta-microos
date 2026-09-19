SUMMARY = "Gstreamer Plugin for PipeWire"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides the gstreamer plugin."
LICENSE = "MIT"

PV = "1.6.8"

RPM_NAME = "gstreamer-plugin-pipewire-1.6.8-2.1.aarch64.rpm"
RPM_HASH = "372f3035e1b3f49d27e305a243edd698262e0280d317fd56c37bfa6f30a4ccd680c8c95107322797d5ea99f09172d67742b911c803a7faf853b7f9420d4a3d12"

RPROVIDES:${PN} += "gstreamer-plugin-pipewire \
gstreamer1 \
libgstpipewire.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libpipewire-0.3.so.0"

inherit rpm
