SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "libxmlsec1-1-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "da827df104277c23e082e89ee87218b1a8c669085d7e3dd1feb776073a4329e8c2f3e22007fd3775085e91e0ecc714aa844173feaac1b6994b7fa5944d62439a"

RPROVIDES:${PN} += "libxmlsec1-1 \
libxmlsec1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
