SUMMARY = "A lightweight radio player"
DESCRIPTION = "A lightweight radio player written in C and GTK+. It offers a simple way \
to have your favorite radio stations at easy reach."
LICENSE = "GPL-3.0-only"

PV = "0.8.4"

RPM_NAME = "goodvibes-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "7b24f439e46ad7bfc7fbb2bf5fea5452531abe1774a8409022756b8f65dd631889ba9afe588a0b44a09bbd39048deb9fc0fd1250144048bb8d3b7124b1da30a6"

RPROVIDES:${PN} += "goodvibes"

RDEPENDS:${PN} += "libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
