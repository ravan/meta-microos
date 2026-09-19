SUMMARY = "Development files for termcap"
DESCRIPTION = "This package contains all necessary include files \
and libraries needed to build termcap based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "termcap-devel-2.0.8-1050.6.aarch64.rpm"
RPM_HASH = "7816f89ae74008040038c2e54edbe1aa386dde230b8767ccf87e71bf5b99935fdd0642401d08785ffd734744b8f81a8f84ed75d0e2dd689ff13cda10861498d6"

RPROVIDES:${PN} += "termcap-/usr/include/curses/curses.h \
termcap-devel"

RDEPENDS:${PN} += "libcurses1 \
libtermcap2"

inherit rpm
