SUMMARY = "Development files for libfcache"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfcache."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "libfcache-devel-20260520-1.6.aarch64.rpm"
RPM_HASH = "cfa71bb6a84bb1818439b6e58eb372c9cd872eb9da0328c6b50b015a097b2bcae3ef0a06dd865b8a6142bc380c36df1190921e75a9adc04279303464a0596450"

RPROVIDES:${PN} += "libfcache-devel \
pkgconfig-libfcache"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcache1"

inherit rpm
