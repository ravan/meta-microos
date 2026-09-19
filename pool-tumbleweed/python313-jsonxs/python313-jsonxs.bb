SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python313-jsonxs-0.6-2.5.noarch.rpm"
RPM_HASH = "99e68e42d64ea1aa54bc9ccf35196fc9bad8cc16f734427dd8959db59c099ed41cfd0a0011c2e3a5d3bbbdcc2b1bcdd0ded4c48349a0b748f670c7bc357a4824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonxs \
python3.13dist-jsonxs \
python313-jsonxs \
python3dist-jsonxs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
