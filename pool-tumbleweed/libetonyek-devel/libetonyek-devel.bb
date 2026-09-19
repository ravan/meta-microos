SUMMARY = "Files for Developing with libetonyek"
DESCRIPTION = "Libetonyek is library providing ability to interpret and import Apple Keynote \
presentations into various applications. \
 \
This package contains the libetonyek development files."
LICENSE = "MPL-2.0"

PV = "0.1.13"

RPM_NAME = "libetonyek-devel-0.1.13-2.3.aarch64.rpm"
RPM_HASH = "dcf1972991e074d124e30565f47b3cedec211b19ec38b9e5cb695929d13baab20ba8e207f92cdc5a0a6d2d9ac56f6e216ebfacb1d27ecd4fb2d070962916c8a9"

RPROVIDES:${PN} += "libetonyek-devel \
pkgconfig-libetonyek-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libetonyek-0-1-1 \
libwpd-devel \
pkgconfig-liblangtag \
pkgconfig-librevenge-0.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
