SUMMARY = "XMLTooling development Headers"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes files needed for development with XMLTooling."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "libxmltooling-devel-3.3.0-1.9.aarch64.rpm"
RPM_HASH = "25cb7943ebc6d66d051015f54e33c2f14f0880593a952fad283be380496acbd036efabceeec1d592146c4c86bdcc959e3cc980f066f1806eff399322dba6ca37"

RPROVIDES:${PN} += "libxmltooling-devel \
pkgconfig-xmltooling \
pkgconfig-xmltooling-lite \
xmltooling-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
libboost-headers-devel \
liblog4shib-devel \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-lite11 \
libxmltooling11 \
openssl-devel \
pkgconfig-libcurl \
pkgconfig-log4shib \
pkgconfig-openssl \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-zlib"

inherit rpm
