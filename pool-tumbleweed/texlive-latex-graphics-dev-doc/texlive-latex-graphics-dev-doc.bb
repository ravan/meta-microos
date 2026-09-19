SUMMARY = "Documentation for texlive-latex-graphics-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-graphics-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_0svn76722"

RPM_NAME = "texlive-latex-graphics-dev-doc-2026.226.pre_release_0svn76722-63.2.noarch.rpm"
RPM_HASH = "16e94bf7dd36f249143be0fbb938768022ecd5355513b5a5e0e8a5718dfa7fefbafd1fd4bdc61ea032320b4818eedca1a58b55d1d19c6c82672106d874b008b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
