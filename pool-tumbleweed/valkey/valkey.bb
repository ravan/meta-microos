SUMMARY = "Persistent key-value database"
DESCRIPTION = "Valkey is an advanced key-value store. It is similar to memcached but the dataset \
is not volatile, and values can be strings, exactly like in memcached, \
but also lists, sets, and ordered sets. All this data types can be manipulated \
with atomic operations to push/pop elements, add/remove elements, perform server \
side union, intersection, difference between sets, and so forth. It supports many \
different kinds of sorting abilities."
LICENSE = "BSD-3-Clause"

PV = "9.1.2"

RPM_NAME = "valkey-9.1.2-1.1.aarch64.rpm"
RPM_HASH = "620312b21e9d1f75cd386d974f6aa570ddb783802c83940a377130304f734c41a013b830b9365a441acc59923a29d7e1145fb014938ee535f3f3a45a2e4a7876"

RPROVIDES:${PN} += "config-valkey \
group-valkey \
user-valkey \
valkey \
valkey-modules-abi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libssl.so.3 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
