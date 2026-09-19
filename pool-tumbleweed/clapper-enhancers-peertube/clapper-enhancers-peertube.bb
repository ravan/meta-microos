SUMMARY = "Clapper Enhancer PeerTube"
DESCRIPTION = "Stream PeerTube vidoes within Clapper"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-peertube-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "03c68654a37497e6eeaaf9935036950018f954a5f4ac6732f70399a520d8374bb033bdc3cd41074a454ed1bbeeabbc683f3856da7d771b9f0a49c89e65bfe8f3"

RPROVIDES:${PN} += "clapper-enhancers-peertube \
libclapper-peertube.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpeas-2.so.0 \
libsoup-3.0.so.0"

inherit rpm
