SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "23.1.1"

RPM_NAME = "python313-lit-23.1.1-1.1.noarch.rpm"
RPM_HASH = "276fc266006bcb38a090fd6ff6de4943f41a70865b3f6af54d6e771ce692e162c5da1a8241cc6509b6eef1aaac271d4336ad0388d70e9e76e2598dc793575192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit \
python3-lit \
python3.13dist-lit \
python313-lit \
python3dist-lit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
