SUMMARY = "Multimedia framework for television broadcasting"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "melt-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "d2304dcfa4ad48a488551d471ecf3ec6bfb47ca68520b572a57b198dd747eb98f7d0dc37abde879a343fa98ca838f95dcd1bd53e92d22ef2cc87ebeb5a4bde34"

RPROVIDES:${PN} += "melt \
melt7"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libmlt-7.so.7 \
libmlt7-data \
libmlt7-modules"

inherit rpm
