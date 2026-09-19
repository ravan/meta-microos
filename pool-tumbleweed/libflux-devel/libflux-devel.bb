SUMMARY = "Development libraries and header files for Influx data language"
DESCRIPTION = "This package contains the header files and libraries for building \
programs using Influx data language."
LICENSE = "Apache-2.0 & MIT & (Apache-2.0 | MIT) & Apache-2.0-with-LLVM-exception & CC-BY-3.0 & CC-BY-SA-4.0 & (Apache-2.0 | BSL-1.0) & BSD-3-Clause & MPL-2.0 & Zlib & X11 & Unicode-DFS-2016 & Unicode-TOU"

PV = "0.199.0"

RPM_NAME = "libflux-devel-0.199.0-1.5.aarch64.rpm"
RPM_HASH = "fb1659cd52e7c9b594651d61604b5d8d6a956f351aa4ec47f6fecaeaa7c8b0714a668a9e3e8b2ed09e596ab94a4e861f8175b77c53b0d57092a08282c95eae8e"

RPROVIDES:${PN} += "libflux-devel \
pkgconfig-flux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libflux0-199-0 \
libgcc-s.so.1"

inherit rpm
