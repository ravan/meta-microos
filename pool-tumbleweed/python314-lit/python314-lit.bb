SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "23.1.1"

RPM_NAME = "python314-lit-23.1.1-1.1.noarch.rpm"
RPM_HASH = "c979cfea22bfec8cc2a9e8dc0dff684433b6eb9d7b73bfa7014e56ffc49c29f220ef22a215082c53e542ca6f6117c0ea192bd6f553060460dbac5a7007ecf9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit \
python3.14dist-lit \
python314-lit \
python3dist-lit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
