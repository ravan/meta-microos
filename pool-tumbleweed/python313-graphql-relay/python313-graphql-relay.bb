SUMMARY = "Relay implementation for Python"
DESCRIPTION = "Relay Library for GraphQL Python. \
 \
This is a library to allow the easy creation of Relay-compliant servers using \
the GraphQL Python reference implementation of a GraphQL server."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-graphql-relay-3.2.0-3.5.noarch.rpm"
RPM_HASH = "d93073a1ee603073cd8cb5c1b86648dbe5e49a540692162b7bba67cb3f1ee45e727a07041530261d0e97591c9080f21826d20ddb398cdaaa235713db5b15e241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-graphql-relay \
python3.13dist-graphql-relay \
python313-graphql-relay \
python3dist-graphql-relay"

RDEPENDS:${PN} += "-python313-graphql-core >= 3.2 \
python-abi \
python313-promise"

inherit rpm
