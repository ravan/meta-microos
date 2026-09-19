SUMMARY = "Control groups management tools devel package"
DESCRIPTION = "This package contains the headers needed to build against \
the libcgroup library in its ABI version 3 form."
LICENSE = "LGPL-2.1-only"

PV = "3.1.0"

RPM_NAME = "libcgroup-devel-3.1.0-1.9.aarch64.rpm"
RPM_HASH = "cdff98c5027509c433298331093c9d025b60aa9215b89904159ea6fa76a295c46985008dd5094795db5043a23c0c07530f92f498bc12390ee3385ef7f8283c64"

RPROVIDES:${PN} += "libcgroup-devel \
pkgconfig-libcgroup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcgroup3"

inherit rpm
