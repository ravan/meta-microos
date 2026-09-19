SUMMARY = "Header files for the libscitokens public interfaces"
DESCRIPTION = "SciTokens provide a token format for distributed authorization. The tokens are \
self-describing, can be verified in a distributed fashion (no need to contact \
the issuer to determine if the token is valid). This is convenient for a \
federated environment where several otherwise-independent storage endpoints \
want to delegate trust for an issuer for managing a storage allocation."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "scitokens-cpp-devel-1.1.3-1.5.aarch64.rpm"
RPM_HASH = "869ebf3bcd261c2df0ae8ea6df037e345df6a01b138c925ab516b7c3f423866f97d1675c4d92d85b91a990b06c0c5133b2303f172494e05269accd90e2797859"

RPROVIDES:${PN} += "scitokens-cpp-devel"

RDEPENDS:${PN} += "libSciTokens0"

inherit rpm
