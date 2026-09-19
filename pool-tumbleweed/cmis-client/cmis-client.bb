SUMMARY = "Sample CMIS client"
DESCRIPTION = "Sample client to access CMIS-enabled repositories using libcmis."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "cmis-client-0.6.2-3.16.aarch64.rpm"
RPM_HASH = "ac20bb7e8f46fa037c90e12c75cf7a3ea878e909c61df699c0f317f6ab0810a3542135e156c9d7c8962262fadb1fc36ee5c4c8ec10f077dceb28e3f7581069fc"

RPROVIDES:${PN} += "cmis-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcmis-0-6-6 \
libcmis-0.6.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
