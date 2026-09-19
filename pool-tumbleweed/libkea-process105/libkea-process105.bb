SUMMARY = "Kea DHCP process abstraction library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-process105-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "082aa3b45b1734acb6782141d54cf369648725c2dda5a8382db6cf0253f0113bb612b58d2980a632cfd89a57869688038aa259392e5046ca8c8a056d9f39a784"

RPROVIDES:${PN} += "libkea-process.so.105 \
libkea-process105"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-cfgrpt.so.3 \
libkea-config.so.98 \
libkea-cryptolink.so.76 \
libkea-database.so.88 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
