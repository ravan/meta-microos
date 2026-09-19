SUMMARY = "Documentation for texlive-vtable"
DESCRIPTION = "This package includes the documentation for texlive-vtable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51126"

RPM_NAME = "texlive-vtable-doc-2026.226.1.0svn51126-60.2.noarch.rpm"
RPM_HASH = "4e6460793316647c2a1faa45a5c6fd5fdc8db9caac9f9cb6f9f5f52cdc935ddb6539d5a59e9558323fbf5abc2ced623df237345b777e351cb35eaafb8804f909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
