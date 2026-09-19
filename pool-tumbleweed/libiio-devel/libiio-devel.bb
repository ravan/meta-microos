SUMMARY = "Industrial I/O library -- development files"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "libiio-devel-0.26-1.10.aarch64.rpm"
RPM_HASH = "3bee5dcbf69edde28d1082cd8f7f863e38b90812702f4eea644dc025a46f92f60b60e7bf1b8ab94cae0e112e482a290ef86ba8226bf5f131796033a263a23e53"

RPROVIDES:${PN} += "libiio-devel \
pkgconfig-libiio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiio0"

inherit rpm
