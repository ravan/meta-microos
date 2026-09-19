SUMMARY = "Library for Portable Symmetric Key Container"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "libpskc0-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "29b0fc0eecb8430b1dff5f8e8e11b18742b430bda174ccb06710618391446112878ccbf062dce5d5a9d7cb089a8b186622cc03b884cfb318e30ab0108ae038d9"

RPROVIDES:${PN} += "libpskc.so.0 \
libpskc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxmlsec1.so.1"

inherit rpm
