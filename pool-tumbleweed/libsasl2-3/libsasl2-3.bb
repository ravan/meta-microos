SUMMARY = "Simple Authentication and Security Layer (SASL) library"
DESCRIPTION = "Simple Authentication and Security Layer (SASL) is a framework for \
authentication and data security in Internet protocols. \
 \
This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "libsasl2-3-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "87474d90eaa1f52909f9610be2088aa4228e27a409f0137e6d85fbe72b5707f3b73cfd867dee957fe1d0710ac14c679accf81ea846c45ee21a30a8c9434d0e30"

RPROVIDES:${PN} += "libsasl2-3 \
libsasl2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
