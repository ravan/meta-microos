SUMMARY = "Development files for libagdb"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libagdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-devel-20210429-3.39.aarch64.rpm"
RPM_HASH = "3cbc4e1ebc24e35019201fc33ed384e3ede806f9fb1f1d2131fddf34c9675dc119cc6da6bd199949512dcb2cf2ea6a62a712665dd7761e6038b03feab23e71bf"

RPROVIDES:${PN} += "libagdb-devel \
pkgconfig-libagdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libagdb1 \
libbfio-devel"

inherit rpm
