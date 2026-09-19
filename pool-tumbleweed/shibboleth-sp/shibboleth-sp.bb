SUMMARY = "System for attribute-based Web Single Sign On"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains the Shibboleth Service Provider runtime libraries, \
daemon, default plugins, and Apache module."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "shibboleth-sp-3.5.1-2.3.aarch64.rpm"
RPM_HASH = "10d7264f101824f7b07dfa18efb9d090418b392e61f352c719ac043ad69134ea6e4747d724feab407eda01bb5980ae39754dc67744b38377b953e0f9db31edbf"

RPROVIDES:${PN} += "config-shibboleth-sp \
group-shibd \
shibboleth-sp \
user-shibd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libmemcached.so.11 \
libodbc.so.2 \
libsaml.so.13 \
libshibsp-lite.so.12 \
libshibsp.so.12 \
libstdc++.so.6 \
libsystemd.so.0 \
libxerces-c-3.3.so \
libxmltooling-lite.so.11 \
libxmltooling.so.11 \
opensaml-schemas \
openssl \
shadow \
systemd \
sysuser-shadow \
xmltooling-schemas"

inherit rpm
