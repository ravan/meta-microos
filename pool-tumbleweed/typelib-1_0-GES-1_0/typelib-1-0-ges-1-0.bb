SUMMARY = "GStreamer Editing Services - Libraries"
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

RPM_NAME = "typelib-1_0-GES-1_0-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "472c3fd166ff3f7eaae7348afe6d24512ec71458a861397fd9fc39577f8ce13f50c92c65a17e0096ab2de30965a45f77954c66721a866be53305a5d542be96a9"

RPROVIDES:${PN} += "typelib-1-0-GES-1-0 \
typelib-GES"

RDEPENDS:${PN} += "libges-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
