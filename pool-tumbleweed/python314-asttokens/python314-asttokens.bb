SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "python314-asttokens-3.0.2-1.1.noarch.rpm"
RPM_HASH = "7c2573319339d23cc8c8500a5b9588a0ed2e2883dd0f8c71bdb4971f9f2a1b8bab6c0a1efdb9d010d621caa28264f4e10bc52d5f90a4b23fcef62bad8f108844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asttokens \
python314-asttokens \
python3dist-asttokens"

RDEPENDS:${PN} += "python-abi"

inherit rpm
