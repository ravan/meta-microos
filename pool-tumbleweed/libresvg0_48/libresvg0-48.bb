SUMMARY = "SVG rendering library (C++/Qt API)"
DESCRIPTION = "An SVG rendering library (C++/Qt API). \
This package contains shared library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.48.1"

RPM_NAME = "libresvg0_48-0.48.1-1.2.aarch64.rpm"
RPM_HASH = "c871e9229705eccc43153ed16a9c5f687afc318e890248799f31f8c5e76a02a34618ec607ae34e69473c55f8613db4642c310cb94b8bb600b34d327147160990"

RPROVIDES:${PN} += "libresvg.so.0.48 \
libresvg0-48"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
