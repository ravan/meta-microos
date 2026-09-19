SUMMARY = "Generic PCI access library"
DESCRIPTION = "Provides functionality for X to access the PCI bus and devices in a \
platform-independent way."
LICENSE = "MIT"

PV = "0.19"

RPM_NAME = "libpciaccess0-0.19-1.3.aarch64.rpm"
RPM_HASH = "14de31747643c7fc42e30a3498532a3e90a8826e9f539d806c569a93ba688a13916e58b418b4a1be76bf0ca1aeb6896cd63a467971c331fcc70e1d9e1f08483b"

RPROVIDES:${PN} += "libpciaccess.so.0 \
libpciaccess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
