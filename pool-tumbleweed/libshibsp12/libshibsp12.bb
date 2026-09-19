SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "libshibsp12-3.5.1-2.3.aarch64.rpm"
RPM_HASH = "2af3be53afe51259f1230e3dd46c10a98ab61cd6be1e1f511da4fdc6f7b5aae253e41aa55f4624782226754a498b6674d31a9352b52b35bdbe2c5284a1a54c05"

RPROVIDES:${PN} += "libshibsp.so.12 \
libshibsp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libsaml.so.13 \
libstdc++.so.6 \
libxerces-c-3.3.so \
libxml-security-c.so.30 \
libxmltooling.so.11"

inherit rpm
