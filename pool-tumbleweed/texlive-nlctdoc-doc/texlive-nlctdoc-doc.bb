SUMMARY = "Documentation for texlive-nlctdoc"
DESCRIPTION = "This package includes the documentation for texlive-nlctdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn76929"

RPM_NAME = "texlive-nlctdoc-doc-2026.226.1.16svn76929-61.2.noarch.rpm"
RPM_HASH = "00206363c4620244f880e19567c1ea20167b0c227c38e76383a9b6664caddcfe3a0a94f304241c9ca16fb4d3cf01eb8781defe1a6aa3c798ccba7699c198cbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nlctdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
