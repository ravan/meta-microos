SUMMARY = "Security Assertion Markup Language library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "libsaml13-3.3.1-2.5.aarch64.rpm"
RPM_HASH = "3c0d7679284512a96055c47508af47d7188813761523df746c4b812304cba7c2b22e324d5b016e57ddd66b2119fb6656ad64893427402be3bde54c7dc975051e"

RPROVIDES:${PN} += "libsaml.so.13 \
libsaml13 \
opensaml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxml-security-c.so.30 \
libxmltooling.so.11"

inherit rpm
