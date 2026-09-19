SUMMARY = "Cisco router Emulator"
DESCRIPTION = "Cisco Router Emulator supported by GNS3 Community \
 \
Dynamips emulates Cisco 7200/3600/3725/3745/2691 Routers on a traditional PC. \
You can use dynamips to create labs. It uses IOS Images (which are not part \
of this package). Of course, this emulator cannot replace a real router. It is \
simply a complementary tool to real labs for administrators of Cisco networks \
or people wanting to pass their CCNA/CCNP/CCIE exams."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.25"

RPM_NAME = "dynamips-0.2.25-1.1.aarch64.rpm"
RPM_HASH = "04c7b7a9782afe3a66bce4249e97bbad336478f2301c9e8a70d607397b365e73b62b353d06cc076936a5ac5f18ba985da62d8847c4c4d1d8977e9a449c2e5dd2"

RPROVIDES:${PN} += "dynamips"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libpcap.so.1"

inherit rpm
