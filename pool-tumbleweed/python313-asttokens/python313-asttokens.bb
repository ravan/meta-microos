SUMMARY = "Annotate AST trees with source code positions"
DESCRIPTION = "Annotate AST trees with source code positions"
LICENSE = "Apache-2.0"

PV = "3.0.2"

RPM_NAME = "python313-asttokens-3.0.2-1.1.noarch.rpm"
RPM_HASH = "edb5df5531204092f87a26c9bf7f7d113dd1d6a4ba1391a2975b4f1cf67b2ef0bd01a1506ffa13bfc99f836bae81827aa643a59257266bd25460f766ee864c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asttokens \
python3.13dist-asttokens \
python313-asttokens \
python3dist-asttokens"

RDEPENDS:${PN} += "python-abi"

inherit rpm
