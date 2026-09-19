SUMMARY = "TLS module for lighttpd that uses NSS"
DESCRIPTION = "TLS module for lighttpd that uses NSS."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_nss-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "00cc54b50fabedfd583ef3fd8e6d6aa8875b5db88392b71e574f077163989e930b6f18fde4ab51bb3d96339253c0daaf0b5c505b52bcafbecdcb02d16d3cb3bc"

RPROVIDES:${PN} += "lighttpd-mod-nss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libssl3.so \
lighttpd"

inherit rpm
