SUMMARY = "Documentation for texlive-fonetika"
DESCRIPTION = "This package includes the documentation for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21326"

RPM_NAME = "texlive-fonetika-doc-2026.226.svn21326-60.2.noarch.rpm"
RPM_HASH = "575cc800e3149bc2bbd8ac2866ad074c566acf294656d06cbb001a968410e56a9a5b2173f44992035f64fbd2b863e0a7a61673656f5aad071afe2d83a05b0d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonetika-doc"

RDEPENDS:${PN} += ""

inherit rpm
