SUMMARY = "Shared libraries for the HPLIP printing system"
DESCRIPTION = "This package contains shared libraries needed by other hplip packages."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "libhplip0-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "5088d1f6ebabbb3c6ca4395f9070f1aedb3f72a253f8cfeaecb45612596950e2f918330e81b03452a96e983df44520f269aeab76075d4dced2952a2424a435be"

RPROVIDES:${PN} += "libhpdiscovery.so.0 \
libhpip.so.0 \
libhpipp.so.0 \
libhplip0 \
libhpmud.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hplip-common \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libnetsnmp.so.45 \
libusb-1.0.so.0"

inherit rpm
