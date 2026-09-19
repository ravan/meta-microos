SUMMARY = "Kea DHCP-DDNS service library"
DESCRIPTION = "This library provides DHCP-DDNS specific event loop and business logic."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-d2srv75-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "19512322d0f8c1e4ce45457a28ee191a83399a391cfa5402328b1afaf4ff9a88798d07134bedf48ea419e9ca453071283dee85d2bd99fd0e94a90cd91e2804f2"

RPROVIDES:${PN} += "libkea-d2srv.so.75 \
libkea-d2srv75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiodns.so.75 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-config.so.98 \
libkea-cryptolink.so.76 \
libkea-dhcp-ddns.so.82 \
libkea-dhcpsrv.so.149 \
libkea-dns.so.84 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-http.so.100 \
libkea-log.so.86 \
libkea-process.so.105 \
libkea-stats.so.64 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
