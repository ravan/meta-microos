SUMMARY = "Development files for gesture recognition library"
DESCRIPTION = "Development files for the gesture recognition library (grail). \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-devel-3.1.1-1.34.aarch64.rpm"
RPM_HASH = "bc6ecda12e8f9e23f3eb601e550f687cb678ddfc9d65b5e2c874cf7543121bb650407c1894697f01bc912f64cafebe79d3fa7f8fdbd741afd7da1f996ecfd1ed"

RPROVIDES:${PN} += "grail-devel \
pkgconfig-grail"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
grail \
libgrail6"

inherit rpm
