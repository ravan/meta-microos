SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations. \
 \
This packlage provides documentation for LiE."
LICENSE = "LGPL-3.0-or-later"

PV = "2.2.2"

RPM_NAME = "LiE-doc-2.2.2-8.9.aarch64.rpm"
RPM_HASH = "d78ca61820c3b07c2c10e5358aa4b5eb63e3730e6e9ab17ec9069232a338ef1339a4ba3a410b0a9f2bec3c3e44fd00b8deddb5acd36d47412f5b834b32a12e73"

RPROVIDES:${PN} += "LiE-doc"

RDEPENDS:${PN} += ""

inherit rpm
