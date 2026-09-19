SUMMARY = "GStreamer Editing Services - Development files"
DESCRIPTION = "The GStreamer multimedia framework and the accompanying GNonLin set \
of plugins for non-linear editing offer all the building blocks \
for: \
Decoding and encoding to a wide variety of formats, through all the \
available GStreamer plugins. \
Easily choosing segments of streams and arranging them through time \
through the GNonLin set of plugins. \
 \
But all those building blocks only offer stream-level access, which \
results in developers who want to write non-linear editors to write \
a consequent amount of code to get to the level of non-linear \
editing notions which are closer and more meaningful for the \
end-user (and therefore the application). \
 \
The GStreamer Editing Services (hereafter GES) aims to fill the gap \
between GStreamer/GNonLin and the application developer by offering \
a series of classes to simplify the creation of many kind of \
editing-related applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-editing-services-devel-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "93c51c8373d6b708109943b58bac720a601d23ce2c34a49f0c368bf6d5c0f0479766882a094fb32128faee0d75ec00b58a5af6a2028c4beb7d1696b73da01432"

RPROVIDES:${PN} += "gstreamer-editing-services-devel \
pkgconfig-gst-editing-services-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-editing-services \
libges-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-validate-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GES-1-0"

inherit rpm
