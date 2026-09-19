SUMMARY = "Shared library from liboauth"
DESCRIPTION = "liboauth is a collection of c functions implementing the http://oauth.net API. \
 \
liboauth provides functions to escape and encode stings according to \
OAuth specifications and offers high-level functionality built on top to sign \
requests or verify signatures using either NSS or OpenSSL for calculating \
the hash/signatures. \
 \
This archive contains the shared library files from liboauth."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "liboauth0-1.0.3-5.10.aarch64.rpm"
RPM_HASH = "801989531019e3d5ad2ee90022db3bd6b6a1622c232e6305b12a650a014c4f90217cbd998b389b311cd4ab7bd8a5b1b452b6167be11510d4870ce1ed859f70d5"

RPROVIDES:${PN} += "liboauth.so.0 \
liboauth0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4"

inherit rpm
