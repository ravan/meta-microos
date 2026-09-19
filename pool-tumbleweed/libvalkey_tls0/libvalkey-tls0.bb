SUMMARY = "Valkey client library in C - TLS support"
DESCRIPTION = "Libvalkey is the official C client for the Valkey database. It also supports \
any server that uses the RESP protocol (version 2 or 3). This project supports \
both standalone and cluster modes. \
 \
This package contains the shared library providing TLS support."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "libvalkey_tls0-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "e55de492a05f17a25db01a80fa058a7b8fd362875274ff5dc96c5bb430fd74fc98dfe8da0a43e3e0d3a7bda742a359247487057af33a2126731b15dbc2aaca74"

RPROVIDES:${PN} += "libvalkey-tls.so.0 \
libvalkey-tls0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libvalkey.so.0"

inherit rpm
