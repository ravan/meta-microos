SUMMARY = "Gtksink plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the gtksink output plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-good-gtk-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "980eddf4dce1cb684d651a4345703474cbfc00f6a11dd109ea3f37d41ac122d319cde6f76d52115762b0e18f947ce51dfaaa564f90e59d3b2fd404ea307afc88"

RPROVIDES:${PN} += "gstreamer-plugins-good-gtk \
gstreamer1 \
libgstgtk.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
