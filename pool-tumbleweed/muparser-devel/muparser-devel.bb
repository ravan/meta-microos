SUMMARY = "Development files for muparser"
DESCRIPTION = "muParser is an extensible math parser library written in C++. It \
works by transforming a mathematical expression into bytecode and \
precalculating constant parts of the expression."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "muparser-devel-2.3.5-1.7.aarch64.rpm"
RPM_HASH = "a043b19c896be9274368b7ad5f29542784e1a78ec50539217f7df6cc07e123cda4e80bb1dc66da8d8654bf2906fd78cb7481d8b023d2df9f796a0fca8be0ad91"

RPROVIDES:${PN} += "cmake-muparser \
muparser-devel \
pkgconfig-muparser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuparser2-3-5"

inherit rpm
