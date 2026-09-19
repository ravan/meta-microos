SUMMARY = "A library to measure network performance"
DESCRIPTION = "libiperf gives you access to all the functionality of the iperf3 \
network testing tool. \
You can build it directly into your own program, instead of having \
to run it as a shell command."
LICENSE = "BSD-3-Clause"

PV = "3.21"

RPM_NAME = "libiperf0-3.21-1.3.aarch64.rpm"
RPM_HASH = "c0de658eadbbcaca10a363bdb4c0f8e00c1939cb2a9c045d92879ecc291e02242615d7cb6ee90490a76270ec7b8247e0f6f2e98d38a8cf809d81569fc957b29a"

RPROVIDES:${PN} += "libiperf.so.0 \
libiperf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
