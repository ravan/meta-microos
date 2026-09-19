SUMMARY = "Kea DHCP server asiolink abstraction layer library"
DESCRIPTION = "The asiodns library provides an abstraction layer between BIND10/Kea \
modules and the asiolink library."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-asiodns75-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "12f92d0e1402a11d3b256403bff4cfd54e424416e22c0c60c4c0dbfca0066d8192663fa4e5fdd451e4b933e4977492d71f7a59701aa48afce7c54df3f80c601d"

RPROVIDES:${PN} += "libkea-asiodns.so.75 \
libkea-asiodns75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cryptolink.so.76 \
libkea-dns.so.84 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libstdc++.so.6"

inherit rpm
