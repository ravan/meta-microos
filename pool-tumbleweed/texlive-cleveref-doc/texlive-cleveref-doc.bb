SUMMARY = "Documentation for texlive-cleveref"
DESCRIPTION = "This package includes the documentation for texlive-cleveref"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21.4svn77682"

RPM_NAME = "texlive-cleveref-doc-2026.226.0.0.21.4svn77682-60.2.noarch.rpm"
RPM_HASH = "e929d0a1e9b11e89b135c7bcbd81f8a99428e3a10457a35f703497f4361b8f4cd43da7b33dd57e4e40a888cd3c5a8f92e7f9e9a57d6b81c17c92fc008c6c8599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleveref-doc"

RDEPENDS:${PN} += ""

inherit rpm
