SUMMARY = "Documentation for texlive-musixtnt"
DESCRIPTION = "This package includes the documentation for texlive-musixtnt"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn69742"

RPM_NAME = "texlive-musixtnt-doc-2026.226.svn69742-61.2.noarch.rpm"
RPM_HASH = "dc701103a0c5039573f4cfce5ea4e092c82c7812797c4f446d9e4ac454ec184d2e06b3f7783d02560cdf8b9adf364899c2e80a9418b5c8d083e1cbdcb7501c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-msxlint.1 \
texlive-musixtnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
