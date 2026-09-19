SUMMARY = "GraphQL client for Python"
DESCRIPTION = "GraphQL client for Python."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-gql-4.0.0-1.1.noarch.rpm"
RPM_HASH = "43cb40e3fcb010a68b9385059668ee80589654a0b670b40a87a87f8c69b49f920127f2dd6f0796c7d4fb43a14693a8b062d70833cfb8f7fcf4401ed2cbd9db36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gql \
python314-gql \
python3dist-gql"

RDEPENDS:${PN} += "-python314-anyio >= 3.0 with python314-anyio < 5 \
-python314-backoff >= 1.11.1 with python314-backoff < 3.0 \
-python314-graphql-core >= 3.2 with python314-graphql-core < 3.3 \
-python314-yarl >= 1.6 with python314-yarl < 2 \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
