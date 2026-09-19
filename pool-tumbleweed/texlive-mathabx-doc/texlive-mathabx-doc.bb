SUMMARY = "Documentation for texlive-mathabx"
DESCRIPTION = "This package includes the documentation for texlive-mathabx"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mathabx-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "849f0ad5a3e446e022818caf3e4cd7228ec3b2fe46b54d74e0b2e78406e90ffaa0ecc9d0fd1f2774c93a09934af835b0dbd13b05ed2df977c17e64a967dbf1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-doc"

RDEPENDS:${PN} += ""

inherit rpm
