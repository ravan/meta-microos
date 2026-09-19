SUMMARY = "Simple GraphQL Client"
DESCRIPTION = "This package offers an easy to use GraphQL client. GraphQL is a query \
language for APIs and a runtime for fulfilling those queries with your \
existing data."
LICENSE = "ISC"

PV = "16.3"

RPM_NAME = "python313-sgqlc-16.3-2.11.noarch.rpm"
RPM_HASH = "b61906b3c09c3fb5d0cfa81d5322359338082efc597c210c9a5c576da55ac76f58765833293c48cd96070aa626f9606e4edddca52b6cfc4a95b44c79e662b72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sgqlc \
python3.13dist-sgqlc \
python313-sgqlc \
python3dist-sgqlc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-graphql-core \
update-alternatives"

inherit rpm
