SUMMARY = "GStreamer plugin for the Interactive Connectivity Establishment"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.23"

RPM_NAME = "gstreamer-libnice-0.1.23-2.3.aarch64.rpm"
RPM_HASH = "7bb33324c7ba9f91340f1b921b0c779bcbbc968c75e5e6b93aae8f59382984ea5f60e2038790e1b11dff02e1ce6308896bd31b160a6cba18b63618577f664819"

RPROVIDES:${PN} += "gstreamer-libnice \
gstreamer1 \
libgstnice.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libnice.so.10"

inherit rpm
