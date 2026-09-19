SUMMARY = "Development Headers for Exiv2"
DESCRIPTION = "Exiv2 is a C++ library and a command line utility to access image \
metadata."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.9"

RPM_NAME = "libexiv2-devel-0.28.9-2.1.aarch64.rpm"
RPM_HASH = "2a55e9f899172f2ad1891c0f2e59b703be98ee07c301b6859775300731493e5794c98f8ef5cb31d06dba66df05907b65d314ee5d291fb0734b11934332a205bc"

RPROVIDES:${PN} += "cmake-exiv2 \
libexiv2-devel \
pkgconfig-exiv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libexiv2-28 \
libexpat-devel \
libstdc++-devel \
pkgconfig-INIReader \
pkgconfig-expat \
pkgconfig-libbrotlidec \
pkgconfig-libcurl \
pkgconfig-zlib"

inherit rpm
