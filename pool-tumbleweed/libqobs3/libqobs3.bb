SUMMARY = "A Qt-based OBS library"
DESCRIPTION = "A library for interacting with the Open Build Service (OBS)."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "libqobs3-3.0.0-1.5.aarch64.rpm"
RPM_HASH = "26b63fab5d6bf1689a8eded8b35ece8b67d3528e174b6a5a40e5e1895ec03cbb5bd26178197d05a1b55a2eb21ef640ad7b97ed91c87142cb213374d1d97f54f0"

RPROVIDES:${PN} += "libqobs.so.3 \
libqobs3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
