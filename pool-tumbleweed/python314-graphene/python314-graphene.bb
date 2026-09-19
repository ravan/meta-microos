SUMMARY = "GraphQL Framework for Python"
DESCRIPTION = "Graphene is a Python library for building GraphQL schemas/types."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "python314-graphene-3.4.3-1.9.noarch.rpm"
RPM_HASH = "31a7d6258b105ea8fb41de6986d523945e3a3fcc0923268d2829a35ec444eac3fdfdc3eb55ab3751d02e1680ff3b70c16650c941ca1edbdfbb3858a2ae002009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphene \
python314-graphene \
python3dist-graphene"

RDEPENDS:${PN} += "python-abi \
python314-graphql-core \
python314-graphql-relay \
python314-python-dateutil \
python314-typing-extensions"

inherit rpm
