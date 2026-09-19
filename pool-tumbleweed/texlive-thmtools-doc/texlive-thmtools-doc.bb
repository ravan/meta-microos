SUMMARY = "Documentation for texlive-thmtools"
DESCRIPTION = "This package includes the documentation for texlive-thmtools"
LICENSE = "LPPL-1.0"

PV = "2026.227.76svn77682"

RPM_NAME = "texlive-thmtools-doc-2026.227.76svn77682-62.2.noarch.rpm"
RPM_HASH = "c33668584bdb8a5f7adddea431bd5cce9da755bdeaaa60f31e4a3edf9a2821cd5eed6ba718d712aae9aaa53a8a562136c9960d24b700e80a06cc9ef9e772e381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
