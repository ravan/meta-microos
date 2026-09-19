SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by the Kea DHCP daemons to establish HTTP \
connections, receive messages and send responses over HTTP. This \
library uses boost ASIO for creating TCP connections and \
asynchronously receive and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-http100-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "bcdc7caf382ee0a6ef1ea5892c53c40c274438aa918d412281e5968bac7ec269fb3fcf21833c283fb4a5369805b54f73e4a98a8bb4b79bb123fba6f5152a3477"

RPROVIDES:${PN} += "libkea-http.so.100 \
libkea-http100"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-dhcp.so.129 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-log.so.86 \
libkea-util.so.118 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
