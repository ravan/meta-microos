SUMMARY = "Assorted data for irrlicht"
DESCRIPTION = "Data files for irrlicht applications \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-data-1.8.5-2.11.aarch64.rpm"
RPM_HASH = "504f5cef31c515952f16fb48e57eaa0c6300a5782be80808ef8c0e39c61f35d52b33594f7d5af7d36290e797de55248f63e7e888ab32385e6e242e8aeaed7c86"

RPROVIDES:${PN} += "irrlicht-data"

RDEPENDS:${PN} += ""

inherit rpm
