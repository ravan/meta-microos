SUMMARY = "Documentation for texlive-catchfilebetweentags"
DESCRIPTION = "This package includes the documentation for texlive-catchfilebetweentags"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn21476"

RPM_NAME = "texlive-catchfilebetweentags-doc-2026.226.1.1svn21476-59.2.noarch.rpm"
RPM_HASH = "b498a84094ac222aeb1c56b5bff790083d671c1bf9a9fa637274c11112b8c8fccfa638c3407e8c683e3ec5e325b637b0cac70ee2eceb35cd670398a1bbec1669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfilebetweentags-doc"

RDEPENDS:${PN} += ""

inherit rpm
