SUMMARY = "C++ Implementation of the SciTokens Library"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "scitokens-cpp-1.1.3-1.5.aarch64.rpm"
RPM_HASH = "9e16b21809be1332b105c850972f7c8061481497f1ddf53844678cba4bbb734e3747857c4a5938fd812b333c5df6b6e54148aad5e4764315d33b93fec035a532"

RPROVIDES:${PN} += "scitokens-cpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSciTokens.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
