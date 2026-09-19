SUMMARY = "Documentation for texlive-elocalloc"
DESCRIPTION = "This package includes the documentation for texlive-elocalloc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-doc-2026.226.0.0.03svn42712-61.4.noarch.rpm"
RPM_HASH = "497cc75bad56b9455179c7203e93e5c6b228a4018d8945757e5b9deb34958411bd597922aef631d3ba2cbf6bf685ef9290a7a7401a81c9eeea2cbe13d908a6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elocalloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
