SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.116.0"

RPM_NAME = "libKF5DocTools5-5.116.0-1.12.aarch64.rpm"
RPM_HASH = "36c8881283ae6606759d1b11f1b4706d7fd4af083fd7a6de54c1ab8d416cbf02318bb6ca13bc4648899b79aca65e98e49760411c21dea669263feed9d958f9f1"

RPROVIDES:${PN} += "libKF5DocTools.so.5 \
libKF5DocTools5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
