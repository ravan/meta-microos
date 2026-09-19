SUMMARY = "Usrsctp Library"
DESCRIPTION = "The libraries for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "libusrsctp2-0.9.5.0-2.5.aarch64.rpm"
RPM_HASH = "60142839c8ceb980f4f5577d122ef3a3cd49b6244171cf732faab0e768b1bc27046369c7a0dc2ea29abbc6601d240f24c5f9f9f4cdd2e529bba7fb60fbd73443"

RPROVIDES:${PN} += "libusrsctp.so.2 \
libusrsctp2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
