SUMMARY = "Documentation for texlive-koma-script"
DESCRIPTION = "This package includes the documentation for texlive-koma-script"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.49.2svn77575"

RPM_NAME = "texlive-koma-script-doc-2026.226.3.49.2svn77575-63.2.noarch.rpm"
RPM_HASH = "0b07d22e629da50689117ad38419fec4b1ec1e229f3f876dd232c58078bb94879b228babd373bfa0a7e5ad22b543e4896edcbcc0c37ace48e0d015fe2b0cdd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-doc"

RDEPENDS:${PN} += ""

inherit rpm
