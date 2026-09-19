SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "libshibsp-lite12-3.5.1-2.3.aarch64.rpm"
RPM_HASH = "2274c4c249864924e0b65a96fa1fc068cbb4a637cb76ffc31ce2e7bec74dbc72466b52398e9233a2ce11e552330c88aa04a4325b1a3b5e386e7cdb2d8d3d1381"

RPROVIDES:${PN} += "libshibsp-lite.so.12 \
libshibsp-lite12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxmltooling-lite.so.11"

inherit rpm
