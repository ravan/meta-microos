SUMMARY = "C++ Implementation of the SciTokens Library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "libSciTokens0-1.1.3-1.5.aarch64.rpm"
RPM_HASH = "00435f4dd5e1284a34a9538bb3b6ce86853a4a59da34fe01774140c33d0951ca637d806e7565ad325bc365626c6130a81ebead3f372b11f74065faa93e545e7a"

RPROVIDES:${PN} += "libSciTokens.so.0 \
libSciTokens0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
