SUMMARY = "Kea TCP library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-tcp45-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "aa0bbc8f5b9442fa2b7f8190b777f48ee145ae690b81721f4ddc2c76adb1ffd9d19a899d17c61254d670b665621e5459ab634e08999d2f6ee0022b8e621cb095"

RPROVIDES:${PN} += "libkea-tcp.so.45 \
libkea-tcp45"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-util.so.118 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
