SUMMARY = "Kea DHCP server socket I/O abstraction layer library"
DESCRIPTION = "The asiolink library provides an abstraction layer between BIND10/Kea \
modules and the socket I/O subsystem Kea is using (currently, \
boost::asio)."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-asiolink105-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "661d309199cb9de70d11559e8b5927efc584a700ad423e3864b63f49eb02b75dce59f0b62325cf4d5f35bd5d49720c7fd548981fceb6c51172a33ffb3d9d8439"

RPROVIDES:${PN} += "libkea-asiolink.so.105 \
libkea-asiolink105"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.55 \
libkea-util.so.118 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
