SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "gstreamermm-doc-1.10.0-6.21.noarch.rpm"
RPM_HASH = "a45d88bfc8dc4b1259c2d1ca59be633a378143b077c8922fe8df4a779a04848694cad01beb81075578694acff650b1abb9a516da2dcb9708d11e4f0895e7eae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamermm-doc"

RDEPENDS:${PN} += ""

inherit rpm
