SUMMARY = "Documentation for texlive-filecontents"
DESCRIPTION = "This package includes the documentation for texlive-filecontents"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5asvn77682"

RPM_NAME = "texlive-filecontents-doc-2026.226.1.5asvn77682-59.2.noarch.rpm"
RPM_HASH = "5b21c766e2998af6be89b8d838766f6c07ab28041efc27947d52391bc802101bda259a3999c930e133ddc463fd4b4c67c2c2ddc87d5fcb86cfec6c6e7f571db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filecontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
