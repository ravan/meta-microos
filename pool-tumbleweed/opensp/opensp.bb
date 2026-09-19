SUMMARY = "The OpenJade Group's SGML and XML Parsing Tools"
DESCRIPTION = "The tools in this package provide the ability to manage SGML and XML \
documents. \
 \
This package contains the parser nsgmls and the related programs \
sgmlnorm, spcat, spam, spent, and sgml2xml (previously known as sx). \
Sgml2xml is useful as a tool for converting from SGML to XML, the \
coming WWW standard. \
 \
This package is a fork from James Clark's SP suite."
LICENSE = "MIT"

PV = "1.5.2"

RPM_NAME = "opensp-1.5.2-205.3.aarch64.rpm"
RPM_HASH = "e1b39525245b93c146ee4e9407709cd3d60129e5fc265c72a666d22d00a8ff28c4b9ac82d5dc21115921d8b0c272503e136ac641d421f454a4cb093dfdcae221"

RPROVIDES:${PN} += "OpenSP \
config-opensp \
libosp.so.5 \
opensp \
sp \
sp-libs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
sgml-skel"

inherit rpm
