SUMMARY = "Files for Developing with libwpg"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format. It is cross-platform, at the moment it can be build \
on Microsoft Windows and Linux. \
 \
This package contains the libwpg development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-0.3.4-2.12.aarch64.rpm"
RPM_HASH = "08092a3577f477cc6d9de203bdc5404ac9e54dc0d0b1403e09493a67d6781400b90e8c9831ce9566eb0b2d1ad7744a5bcf1f1a6c8ab7ff762c7ed215873ef22f"

RPROVIDES:${PN} += "libwpg-devel \
pkgconfig-libwpg-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpg-0-3-3 \
pkgconfig-librevenge-0.0 \
pkgconfig-libwpd-0.10"

inherit rpm
