SUMMARY = "Development files for readline"
DESCRIPTION = "This package contains the header files for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "readline-devel-8.3.3-2.6.aarch64.rpm"
RPM_HASH = "e01904fe01eb03586c71457fd459a0949ec5d8e284cc23fe95cd7a42859431ed7d3a7c6d561f9e4df06894286596232264ffcd11e80a747cfb2dcfdf3baf63b6"

RPROVIDES:${PN} += "pkgconfig-history \
pkgconfig-readline \
readline-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreadline8 \
ncurses-devel \
pkgconfig-tinfo"

inherit rpm
