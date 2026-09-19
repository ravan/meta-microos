SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with NSS."
LICENSE = "MIT"

PV = "1.2.42"

RPM_NAME = "xmlsec1-nss-devel-1.2.42-1.8.aarch64.rpm"
RPM_HASH = "1c605e707e9656a2b62dec19d131fbd92cbe71553fe64def4fee70fc6f0bdef3df2d538941a10546e2acf9ad86fd1187a0db7fe36bfe4d5a5f4f1e87edd471bc"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-nss \
xmlsec1-nss-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-nss1 \
mozilla-nspr-devel \
mozilla-nss-devel \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-nspr \
pkgconfig-nss \
xmlsec1-devel"

inherit rpm
