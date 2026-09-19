SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python314-graphql-relay-3.2.0-3.5.noarch.rpm"
RPM_HASH = "aa4747f53cbb1ff24d188f0be694ec91b7218bf6e2599614dbf07e6eb05ac92ac4dfadcee3cb2f76480a3b829f8781dcaa6da078e86e1cb78534ecb8203e6506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphql-relay \
python314-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python314-graphql-core >= 3.2 \
python-abi \
python314-promise"

inherit rpm
