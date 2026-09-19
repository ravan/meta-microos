SUMMARY = "Dutch ispell dictionary"
DESCRIPTION = "This package includes a ready Dutch dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-dutch-1.5-426.1.aarch64.rpm"
RPM_HASH = "6094ac7b8fc6a67786b1fe54bfeaa74236a6ff623f495348d3552d959a78f42b116f3c4e11ead593a0ef6bfbcaa56a360c0e523da3cb029da1ce50a59f879d62"

RPROVIDES:${PN} += "idutch \
ispell-dictionary \
ispell-dutch \
locale-ispell-nl"

RDEPENDS:${PN} += ""

inherit rpm
