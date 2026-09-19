SUMMARY = "GraphQL implementation for Python"
DESCRIPTION = "GraphQL implementation for Python, a port of GraphQL.js, \
the JavaScript reference implementation for GraphQL."
LICENSE = "MIT"

PV = "3.2.11"

RPM_NAME = "python314-graphql-core-3.2.11-1.2.noarch.rpm"
RPM_HASH = "d9ea13631b613106736996d63577971e58dbec24ada010eace56cff1b0ef13fd1b61bd03c951dfac2ef8da1221e69abca79e9583363a5f3f189b53e48d932d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-graphql-core \
python314-graphql-core \
python3dist-graphql-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
