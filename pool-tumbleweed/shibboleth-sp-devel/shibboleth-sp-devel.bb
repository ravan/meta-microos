SUMMARY = "Shibboleth Development Headers"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package includes files needed for development with Shibboleth."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "shibboleth-sp-devel-3.5.1-2.3.aarch64.rpm"
RPM_HASH = "b4477516b11c28e51ed4f4fafbd48b62f21cfff28dc65f7dba6e39ae7c5dc87018ef1bee0db2c7118d894222d55db0f65b1b75ce16acd6bb5943cb8bb708b5cc"

RPROVIDES:${PN} += "pkgconfig-shibsp \
pkgconfig-shibsp-lite \
shibboleth-sp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4shib-devel \
libsaml-devel \
libshibsp-lite12 \
libshibsp12 \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-devel \
pkgconfig-krb5-gssapi \
pkgconfig-log4shib \
pkgconfig-opensaml \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-xmltooling \
pkgconfig-xmltooling-lite \
shibboleth-sp"

inherit rpm
