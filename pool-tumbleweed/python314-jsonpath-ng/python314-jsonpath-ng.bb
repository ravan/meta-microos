SUMMARY = "JSONPath for Python"
DESCRIPTION = "A final implementation of JSONPath for Python that aims to be \
standard compliant, including arithmetic and binary comparison \
operators and providing clear AST for metaprogramming."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "python314-jsonpath-ng-1.8.0-1.3.noarch.rpm"
RPM_HASH = "cfb449caaa18b3abb393f06a3e742873384051e38be675e82ab8bef45fddf70a147abd3fd268a9cb96fde9278b391470d83dcbe56d5cfbb7e1b7ca8482046c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpath-ng \
python314-jsonpath-ng \
python3dist-jsonpath-ng"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
