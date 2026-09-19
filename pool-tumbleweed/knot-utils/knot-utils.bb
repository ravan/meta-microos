SUMMARY = "Utilities to query and test DNS coming from Knot project"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains tools to query and test DNS like kdig and knsupdate."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "knot-utils-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "26c11b1f6e767b25759c58773f8f9a0a229b7731a7d5d0619b2de92033c81dec85deac6797868f8505cba863288365341f05ae7d3c9f0e337b73685148c176ea"

RPROVIDES:${PN} += "knot-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libfstrm.so.0 \
libgnutls.so.30 \
libidn2.so.0 \
libknot.so.17 \
liblmdb-0.9.35.so \
libnghttp2.so.14 \
libngtcp2-crypto-gnutls.so.8 \
libngtcp2.so.16 \
libprotobuf-c.so.1 \
libzscanner.so.5"

inherit rpm
