SUMMARY = "Headers for the Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.38.0"

RPM_NAME = "libyaz-devel-5.38.0-1.1.aarch64.rpm"
RPM_HASH = "9b584ca52bcf63f4ad57116f246a1e60955b477eefc26a0b161022adc9ff2d6606e7d90ef6437f5d1f4c250c2038f261c19f37a701ffb6a15295599718d3e234"

RPROVIDES:${PN} += "libyaz-devel \
pkgconfig-yaz \
pkgconfig-yaz-icu \
pkgconfig-yaz-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
/usr/bin/tclsh \
libyaz5 \
openssl-devel \
pkgconfig-icu-i18n \
pkgconfig-icu-uc \
pkgconfig-libexslt \
pkgconfig-libxslt \
pkgconfig-yaz \
tcpd-devel \
yaz"

inherit rpm
