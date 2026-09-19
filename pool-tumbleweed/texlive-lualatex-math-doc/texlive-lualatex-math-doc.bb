SUMMARY = "Documentation for texlive-lualatex-math"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-lualatex-math-doc-2026.226.1.12svn77682-59.2.noarch.rpm"
RPM_HASH = "7596dbf2df71a7d453aee65222b2e806b7b78b2ce24f3742d4c4092d532f040bbe637dc6b7c58caae747e0b729d1e9a59ff1a59f7ad69b9ea63eb5587e7519c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lualatex-math-doc-en \
texlive-lualatex-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
