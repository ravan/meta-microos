SUMMARY = "Development files for the Apache C++ XML security library"
DESCRIPTION = "The xml-security-c library is a C++ implementation of the XML Digital Signature \
and Encryption specifications. The library makes use of the Apache XML project's \
Xerces-C XML Parser and Xalan-C XSLT processor. The latter is used for processing \
XPath and XSLT transforms. \
 \
This package includes files needed for development with xml-security-c."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "libxml-security-c-devel-3.0.0-1.8.aarch64.rpm"
RPM_HASH = "48e59eb314ef2d3602471afff9c003280bd73020e5be0425cd9ad3c163594d22bbb569d0c52d4625c39e31abc0bec56ed9ea4b287a928e366ca32c85c31be40f"

RPROVIDES:${PN} += "libxml-security-c-devel \
pkgconfig-xml-security-c \
xml-security-c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxalan-c-devel \
libxerces-c-devel \
libxml-security-c30 \
openssl-devel \
pkgconfig-libcrypto \
pkgconfig-xerces-c"

inherit rpm
