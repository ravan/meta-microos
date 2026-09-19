SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.11"

RPM_NAME = "python313-graphql-core-3.2.11-1.2.noarch.rpm"
RPM_HASH = "50ef731c108f3954b75f186e4cb812b527c11d1d8992c73eba7a285732f20ce246e5c909b2f4e5f480a6dcf49394ad85ee7ee91e5b939c1a4577e4712d098d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-core \
python3.13dist-graphql-core \
python313-graphql-core \
python3dist-graphql-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
