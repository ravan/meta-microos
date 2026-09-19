SUMMARY = "Documentation for texlive-biblatex-ext"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn77682"

RPM_NAME = "texlive-biblatex-ext-doc-2026.226.0.0.20svn77682-61.2.noarch.rpm"
RPM_HASH = "e3a9414238bc422281a8999b1d50d120d7e9ee614a5a9b460d86ade1856e463f8c789b7af4b08ee19679cf530ee1ee9fdabc169c062732b1a661d66007d23a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
