SUMMARY = "Provides libknet1 openssl support"
DESCRIPTION = "Provides OpenSSL crypto support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-crypto-openssl-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "ae28362b0d181855e7c4b5e1f5e74fe46d3a1d68e5b2a4251fa5691684c36dca10f3b7a53b102ef6541eadc3564d06f2813744c6e6b91f1f06775aa21984b770"

RPROVIDES:${PN} += "libknet1-crypto-openssl-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libknet1"

inherit rpm
