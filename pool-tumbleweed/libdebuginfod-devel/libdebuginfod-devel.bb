SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdebuginfod-devel-0.194-1.2.aarch64.rpm"
RPM_HASH = "e5dd06d5e4ec095573e6673eb0d3b573a91caea9253dcf4cca5992b5506323a67ff8d7b8c61ff7202be567ebe1f20d5d2d305bf26fb5eaa51ac9180f78575ec0"

RPROVIDES:${PN} += "libdebuginfod-devel \
pkgconfig-libdebuginfod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdebuginfod1"

inherit rpm
