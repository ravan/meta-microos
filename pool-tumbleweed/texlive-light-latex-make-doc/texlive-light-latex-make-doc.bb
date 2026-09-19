SUMMARY = "Documentation for texlive-light-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn66473"

RPM_NAME = "texlive-light-latex-make-doc-2026.226.1.2.0svn66473-61.2.noarch.rpm"
RPM_HASH = "f97f35edfa858cefae8a682e088fda213d178de6be4a99feaedbb0fd9b0e8cee7f203b4c9b92e1818208a024e24910b211eebad87359a625abc060edfd2e8904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-llmk.1 \
texlive-light-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
