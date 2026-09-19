SUMMARY = "Development files for audaspace"
DESCRIPTION = "The audaspace-devel package contains libraries and header files for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-devel-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "d9070adffef106e614f352416c07806160dc9a502fb82e67df9b2ffba25bde19345db7cb38ee699d37d3f4afbe5c606de3779b068408f0fb9340ab1392f8849f"

RPROVIDES:${PN} += "audaspace-devel \
pkgconfig-audaspace"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudaspace-c1-10 \
libaudaspace-py1-10 \
libaudaspace1-10"

inherit rpm
