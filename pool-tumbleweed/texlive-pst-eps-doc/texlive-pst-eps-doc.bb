SUMMARY = "Documentation for texlive-pst-eps"
DESCRIPTION = "This package includes the documentation for texlive-pst-eps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-pst-eps-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "64aacfe92761d19d0f84e6f173c51fceb93f5fb0fa0a0266c17ab865643c89c8769ef56e3903f8b7dd1075134a46f9b17f0649a212dcf2c5b5a9499618015e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eps-doc"

RDEPENDS:${PN} += ""

inherit rpm
