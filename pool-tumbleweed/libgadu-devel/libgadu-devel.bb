SUMMARY = "Library for Handling of Gadu-Gadu Instant Messaging"
DESCRIPTION = "libgadu is a library for handling of protocol of a popular Polish \
instant messenger Gadu-Gadu."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "libgadu-devel-1.12.2-2.29.aarch64.rpm"
RPM_HASH = "437f32f179d3f580e73e248eedfdf9aa563da11f6a2f3894be0b5865441389770ad9dbcd05a867116ff75adfca45c1edfa697ed4cdbcac37455f383eab783c50"

RPROVIDES:${PN} += "libgadu-devel \
pkgconfig-libgadu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgadu3 \
pkgconfig-gnutls"

inherit rpm
