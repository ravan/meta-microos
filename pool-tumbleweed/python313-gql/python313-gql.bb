SUMMARY = "GraphQL client for Python"
DESCRIPTION = "GraphQL client for Python."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-gql-4.0.0-1.1.noarch.rpm"
RPM_HASH = "7c2fa79a428ac3eb73511e7ecdb6d9b70f66e99a461310a60eb6160245495bc516c6f5c3ddc1642709ed3fb0cfa2f37dbb3a5e92b2b782561ed285e1bf82c26d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gql \
python3.13dist-gql \
python313-gql \
python3dist-gql"

RDEPENDS:${PN} += "-python313-anyio >= 3.0 with python313-anyio < 5 \
-python313-backoff >= 1.11.1 with python313-backoff < 3.0 \
-python313-graphql-core >= 3.2 with python313-graphql-core < 3.3 \
-python313-yarl >= 1.6 with python313-yarl < 2 \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
