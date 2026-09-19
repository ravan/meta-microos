SUMMARY = "Documentation for texlive-philosophersimprint"
DESCRIPTION = "This package includes the documentation for texlive-philosophersimprint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn56954"

RPM_NAME = "texlive-philosophersimprint-doc-2026.226.1.5svn56954-58.2.noarch.rpm"
RPM_HASH = "09e0844a7cbcf6a5dd5ab54a5207c1fd3f95ef2edfc59dc482b476ebbd9c11910d96e4865798e3e64ebc2e1d0d90216b959a96a102d28edd74373fbcb1b219ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philosophersimprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
