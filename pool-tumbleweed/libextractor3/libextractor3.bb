SUMMARY = "Shared libraries for libextractor"
DESCRIPTION = "GNU Libextractor is a library for extracting meta data from various files types. \
 \
This package contains the shared libraries for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor3-1.14-1.2.aarch64.rpm"
RPM_HASH = "bdf5e7bd17904978dfccd3cba9ccf54dd60c5a9c9283e457385b5326f9a19f57a1e1115b2db274ee52317283d59d17aadecdbed98445e4dfb96d5885ef97e949"

RPROVIDES:${PN} += "libextractor.so.3 \
libextractor3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libbz2.so.1 \
libc.so.6 \
libltdl.so.7 \
libz.so.1"

inherit rpm
