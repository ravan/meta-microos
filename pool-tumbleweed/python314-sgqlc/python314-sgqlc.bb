SUMMARY = "Simple GraphQL Client"
DESCRIPTION = "This package offers an easy to use GraphQL client. GraphQL is a query \
language for APIs and a runtime for fulfilling those queries with your \
existing data."
LICENSE = "ISC"

PV = "16.3"

RPM_NAME = "python314-sgqlc-16.3-2.11.noarch.rpm"
RPM_HASH = "a3c5dd477e8e2ec05eb5da57ec246dc40588b76327a6540d9510caba8bdb4d29823167ac799a601c3d7ee1ddc8931c000ddd12ba0c31995c1e11cfd381986549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sgqlc \
python314-sgqlc \
python3dist-sgqlc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-graphql-core \
update-alternatives"

inherit rpm
