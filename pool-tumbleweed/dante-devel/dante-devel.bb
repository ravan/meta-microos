SUMMARY = "Development files for the Dante SOCKSv4/v5 library"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. \
 \
This package contains the header files for Dante."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "dante-devel-1.4.4-2.4.aarch64.rpm"
RPM_HASH = "179d8f1b75c0015365ccf8c1c55bb8f8cd682353d6bf6afa7b86e0e36490ae396fdb83ab9ccded1477a3e9e7bd8a9c965fedc7a6ed0d46618857aea2eb7f3bc9"

RPROVIDES:${PN} += "dante-devel \
dantedev"

RDEPENDS:${PN} += "libsocks0"

inherit rpm
