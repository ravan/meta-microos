SUMMARY = "Development and Include Files for liboauth"
DESCRIPTION = "liboauth is a collection of c functions implementing the http://oauth.net API. \
 \
liboauth provides functions to escape and encode stings according to \
OAuth specifications and offers high-level functionality built on top to sign \
requests or verify signatures using either NSS or OpenSSL for calculating \
the hash/signatures. \
 \
This archive contains the header files for liboauth development."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "liboauth-devel-1.0.3-5.10.aarch64.rpm"
RPM_HASH = "5b25062e91bc1b59cbabd0e1137fbc53a81c8183968a91dd54f77eaf5ba643ef1d4f0d1c9ea7325cf66b7f1e7f0155723cef39ea064afa548c3ed1fc072dab82"

RPROVIDES:${PN} += "liboauth-devel \
pkgconfig-oauth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboauth0"

inherit rpm
