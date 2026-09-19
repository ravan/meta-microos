SUMMARY = "Documentation for texlive-subeqn"
DESCRIPTION = "This package includes the documentation for texlive-subeqn"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0csvn77682"

RPM_NAME = "texlive-subeqn-doc-2026.226.2.0csvn77682-64.2.noarch.rpm"
RPM_HASH = "10cd187b9296d3f3880911fe8344c2868b2c2d45657101f0989366295071ec73f81e42c012649caae712d53a717087c83b2204071591b657fccfb9324a54c209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
