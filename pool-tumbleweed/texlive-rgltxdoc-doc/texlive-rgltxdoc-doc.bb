SUMMARY = "Documentation for texlive-rgltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-rgltxdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-doc-2026.226.1.3svn53858-60.4.noarch.rpm"
RPM_HASH = "cff0060ed13a481412c1f071650c60f25b8f6ed0949290f4cd6eea5d7a0a0fb4852c5169d69e414f5512d21c60db65f9854f85e3d3cb3a837ec16cadcab2d4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rgltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
