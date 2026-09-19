SUMMARY = "Documentation for texlive-xpatch"
DESCRIPTION = "This package includes the documentation for texlive-xpatch"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-xpatch-doc-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "29068db8da7bb957cc66ab4630bfe6096de735c3004378817b356b30d4cb93d6e197f6ce2c4aba2fba23b8f4d5faa19767f387f787a3d6342842fffa934a987e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
