SUMMARY = "Documentation for texlive-kvoptions"
DESCRIPTION = "This package includes the documentation for texlive-kvoptions"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.15svn77682"

RPM_NAME = "texlive-kvoptions-doc-2026.226.3.15svn77682-63.2.noarch.rpm"
RPM_HASH = "cfeb4f2bec5a9b8a58599278aa12063cb1e01f6679836c2428dcda7226d887df580f4ad7abb46611fd43c6f992b6c46abd2ec7fc51ec9a0e4ae7feba8043782e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kvoptions-doc-en \
texlive-kvoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
