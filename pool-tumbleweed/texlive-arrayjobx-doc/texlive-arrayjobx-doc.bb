SUMMARY = "Documentation for texlive-arrayjobx"
DESCRIPTION = "This package includes the documentation for texlive-arrayjobx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-doc-2026.226.1.04svn18125-60.2.noarch.rpm"
RPM_HASH = "a49388b5d096b0144a9b726a42e71900bf58d60b8b70d044b081fa82e9ec5c193440142f93131d9f14caadad3e2bcebc6d375ed2c9efc2d34b10a7452b0e5e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arrayjobx-doc"

RDEPENDS:${PN} += ""

inherit rpm
