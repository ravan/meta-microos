SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python313-jsonpath-ng-1.8.0-1.3.noarch.rpm"
RPM_HASH = "8a27ef32e75a04d64791015ef61cbabb11fbf925b40df611917774c6d02309979d58b7f8d94cce3638d948070aec7473f794900a6215737b7a3bed768008501c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-ng \
python3.13dist-jsonpath-ng \
python313-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
