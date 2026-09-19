SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "dante-1.4.4-2.4.aarch64.rpm"
RPM_HASH = "aab4b39f29bfb456c53a39bc02d02ed0043e125e1db9f5a98476f6dc1634ed68cd1971bb2ad1963b43297315b3440824b34e479a16fd50a5c84ca202b8ffe60c"

RPROVIDES:${PN} += "config-dante \
dante \
libdsocks.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libminiupnpc.so.21"

inherit rpm
