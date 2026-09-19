SUMMARY = "Documentation for texlive-de-macro"
DESCRIPTION = "This package includes the documentation for texlive-de-macro"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.1svn66746"

RPM_NAME = "texlive-de-macro-doc-2026.226.1.4.1svn66746-59.2.noarch.rpm"
RPM_HASH = "d44a05c824642250d269656c91b06097857bafc4f926748d0c9bc5c9fd5278d7fdc76a6d5e8eb7c23dccb5f924542665bf150c59d4afdcb7aba875a64fcdce97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-de-macro-doc"

RDEPENDS:${PN} += ""

inherit rpm
