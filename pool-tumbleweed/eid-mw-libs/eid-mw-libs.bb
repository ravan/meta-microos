SUMMARY = "Belgium electronic identity card PKCS#11 module - libraries"
DESCRIPTION = "The eID Middleware provides the libraries, a PKCS#11 module and a Firefox \
plugin to use Belgian eID (electronic identity) card in order to access \
websites and/or sign documents. This package contains the actual libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.29"

RPM_NAME = "eid-mw-libs-5.1.29-1.2.aarch64.rpm"
RPM_HASH = "375ead5e8dd1b7603fbe95bd4bea032528a62696479edcefeb3e2a4beb28e67d29aa01bf32c94220b4b59753d28b466b6461707b246be41c5eb564d293c480be"

RPROVIDES:${PN} += "eid-mw-libs \
libbeidpkcs11.so.0 \
libeidviewer.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libpcsclite.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
