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

RPM_NAME = "python313-lsprotocol-2025.0.0-1.4.noarch.rpm"
RPM_HASH = "9213845beb8805f9ffd7862b32b04a95e237594467d662db143273c66aa6c07287551f1cd5beb160f023ae4a2723db6527871cb9809decc93c51f922b60a554f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lsprotocol \
python3.13dist-lsprotocol \
python313-lsprotocol \
python3dist-lsprotocol"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-cattrs"

inherit rpm
