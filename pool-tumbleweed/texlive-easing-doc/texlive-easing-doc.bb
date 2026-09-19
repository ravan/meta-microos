SUMMARY = "Documentation for texlive-easing"
DESCRIPTION = "This package includes the documentation for texlive-easing"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75712"

RPM_NAME = "texlive-easing-doc-2026.226.0.0.1svn75712-61.4.noarch.rpm"
RPM_HASH = "783f98afeeb0807e52f99855b114604e691af615d677244c81016bc7a2a6cbb7ded7b4d6d042db5bd9fa1f4668822d1d59a88a88d1034fd8d1b8b42f00f89f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easing-doc"

RDEPENDS:${PN} += ""

inherit rpm
