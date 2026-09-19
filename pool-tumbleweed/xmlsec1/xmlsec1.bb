SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "c1514577c837b4a4175fe1f9daf86db99e66e1d622b81d44700cbd008d6a5b3b03275b775d644ee1b247f9073c00984a39f8000fa7b23d0122d2d42126ad9da4"

RPROVIDES:${PN} += "xmlsec1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxmlsec1.so.1 \
libxslt.so.1"

inherit rpm
