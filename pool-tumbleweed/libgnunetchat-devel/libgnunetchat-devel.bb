SUMMARY = "Development files for libgnunetchat"
DESCRIPTION = "This library is an abstraction layer using the client API from different GNUnet \
services to provide the functionality of a typical messenger application. The \
goal is to make developing such applications easier and independent of the GUI \
toolkit. So people can develop different interfaces being compatible with \
eachother despite visual differences, a few missing features or differences in \
overall design. \
 \
This package contains files required for building with libgnunetchat"
LICENSE = "AGPL-3.0-or-later"

PV = "0.6.1"

RPM_NAME = "libgnunetchat-devel-0.6.1-1.3.aarch64.rpm"
RPM_HASH = "f31f4aec26dd49686ef97111e4ed364da2e3eb6090c9a9717d8b077d67156de94b377deca483631e2cb70742d4d8f2c678a087ccbf53298f92142c8fa9e65d86"

RPROVIDES:${PN} += "libgnunetchat-devel \
pkgconfig-gnunetchat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnunetchat \
pkgconfig-gnunetarm \
pkgconfig-gnunetfs \
pkgconfig-gnunetgns \
pkgconfig-gnunetgnsrecord \
pkgconfig-gnunetidentity \
pkgconfig-gnunetmessenger \
pkgconfig-gnunetnamestore \
pkgconfig-gnunetreclaim \
pkgconfig-gnunetregex \
pkgconfig-gnunetutil"

inherit rpm
