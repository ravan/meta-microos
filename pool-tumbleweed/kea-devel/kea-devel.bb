SUMMARY = "Development files for the Kea DHCP server"
DESCRIPTION = "Development files for the Kea DHCP server"
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "kea-devel-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "c4ff2b94b583d549be3e5ef466db76d8d49c31faf3ea0896dcb63217ec07a4d8aeee11957df3e7a342a32c75f83a46cd76d040905d2fe9a3a450777153fbf00a"

RPROVIDES:${PN} += "kea-devel \
pkgconfig-kea"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiodns75 \
libkea-asiolink105 \
libkea-cc98 \
libkea-cfgrpt3 \
libkea-config98 \
libkea-cryptolink76 \
libkea-d2srv75 \
libkea-database88 \
libkea-dhcp-ddns82 \
libkea-dhcp129 \
libkea-dhcpsrv149 \
libkea-dns84 \
libkea-eval97 \
libkea-exceptions.so.55 \
libkea-exceptions55 \
libkea-hooks139 \
libkea-http100 \
libkea-log-interprocess4 \
libkea-log.so.86 \
libkea-log86 \
libkea-mysql106 \
libkea-pgsql105 \
libkea-process105 \
libkea-stats64 \
libkea-tcp45 \
libkea-util-io12 \
libkea-util.so.118 \
libkea-util118 \
libstdc++.so.6 \
pkgconfig-krb5-gssapi \
pkgconfig-libpq \
pkgconfig-log4cplus \
pkgconfig-openssl"

inherit rpm
