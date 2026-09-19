SUMMARY = "Kea DHCP server configuration client library"
DESCRIPTION = "The Kea DHCP server can be managed at runtime via the Control \
Channel. The CC allows an external entity (e.g. a tool run by a \
sysadmin or a script) to issue commands to the server which can \
influence its behavior or retreive information from it. Examples \
envisioned are: reconfiguration, statistics retrieval and \
manipulation, and shutdown. \
 \
Communication over the Control Channel is conducted using JSON \
structures."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-config98-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "8af2bc2af44a6823a97e4535c0a3f5c90b903b8a2967e8749f24c8f1050d726979a6aeca15aacba1e0c3c4e3247665ba6cdca693f63636bdc416d970d0f77dc5"

RPROVIDES:${PN} += "libkea-config.so.98 \
libkea-config98"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-cryptolink.so.76 \
libkea-dhcp.so.129 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-http.so.100 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
