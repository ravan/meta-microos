SUMMARY = "Building blocks for modern GNOME applications"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the shared library for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.3"

RPM_NAME = "libadwaita-1-0-1.9.3-1.1.aarch64.rpm"
RPM_HASH = "85b5c6637fc59b1e6dc2dbc9e8e3523b0d589a9717be3c420ec332595edf58037a5d6452cb9fe0bde6d6ae0c3215a295b61c21a68d2935e321badf0afa90a301"

RPROVIDES:${PN} += "libadwaita \
libadwaita-1-0 \
libadwaita-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
