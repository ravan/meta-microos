SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "clutter-gst-devel-3.0.27-2.16.aarch64.rpm"
RPM_HASH = "c6a53f3433442119b7dbf5ee2bd7985e6abd9821a131909bef6bc48efbdb53eabf49dbe3206aad5457890a243745a45bbb844ca60cf1c27ed440a2c3f39ae419"

RPROVIDES:${PN} += "clutter-doc \
clutter-gst-devel \
pkgconfig-clutter-gst-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugin-cluttergst3 \
libclutter-gst-3-0-0 \
pkgconfig-clutter-1.0 \
pkgconfig-cogl-2.0-experimental \
pkgconfig-gio-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-plugins-base-1.0 \
pkgconfig-gstreamer-video-1.0 \
typelib-1-0-ClutterGst-3-0"

inherit rpm
