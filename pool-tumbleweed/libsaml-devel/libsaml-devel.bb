SUMMARY = "OpenSAML development Headers"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes files needed for development with OpenSAML."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "libsaml-devel-3.3.1-2.5.aarch64.rpm"
RPM_HASH = "2d8c0efd5a0c784492e4649f7306a41a417ae75471f13c34ec55c459b8ce208095dc7d3e1df66e033d45c156642edf165d2222f40e6c0ee2b70f956e14050afc"

RPROVIDES:${PN} += "libsaml-devel \
opensaml-devel \
pkgconfig-opensaml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4shib-devel \
libsaml13 \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-devel \
pkgconfig-log4shib \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-xmltooling"

inherit rpm
