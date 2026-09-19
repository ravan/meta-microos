SUMMARY = "Python implementation of the Language Server Protocol"
DESCRIPTION = "lsprotocol is a python implementation of object types used in the \
Language Server Protocol (LSP). This repository contains the code \
generator and the generated types for LSP. \
 \
LSP is used by editors to communicate with various tools to \
enables services like code completion, documentation on hover, \
formatting, code analysis, etc. The intent of this library is \
to allow you to build on top of the types used by LSP. This \
repository will be kept up to date with the latest version of LSP \
as it is updated."
LICENSE = "MIT"

PV = "2025.0.0"

RPM_NAME = "python314-lsprotocol-2025.0.0-1.4.noarch.rpm"
RPM_HASH = "4910409f3f28d8224b1c61bcecb7fc1ef1aa0ff0d4008d49b77702d340f9f8cf42b3765012be55e96a55c7dbb2adccdd922d3bb496d94472e83bc669f0ea5602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lsprotocol \
python314-lsprotocol \
python3dist-lsprotocol"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-cattrs"

inherit rpm
