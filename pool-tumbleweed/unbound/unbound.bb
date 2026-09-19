SUMMARY = "Validating, recursive, and caching DNS(SEC) resolver"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
The C implementation of Unbound is developed and maintained by NLnet \
Labs. It is based on ideas and algorithms taken from a java prototype \
developed by Verisign labs, Nominet, Kirei and ep.net. \
 \
Unbound is designed as a set of modular components, so that also \
DNSSEC (secure DNS) validation and stub-resolvers (that do not run \
as a server, but are linked into an application) are easily possible."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "unbound-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "cf8a46de4e3728e5e52af65e9611fe2cb0ce8fe3afdc380872a2bc321fe306242d7df4356cc77c6c616059bcb15269ac2305ebab0725f93c936f3272f98cc940"

RPROVIDES:${PN} += "config-unbound \
unbound"

RDEPENDS:${PN} += "/usr/bin/sh \
group-unbound \
ld-linux-aarch64.so.1 \
ldns \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libhiredis.so.1.3.0 \
libnghttp2.so.14 \
libngtcp2-crypto-ossl.so.0 \
libngtcp2.so.16 \
libprotobuf-c.so.1 \
libpython3.13.so.1.0 \
libsodium.so.26 \
libssl.so.3 \
libunbound.so.8 \
openssl \
systemd \
user-unbound"

inherit rpm
