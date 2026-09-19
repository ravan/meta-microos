SUMMARY = "Documentation for texlive-eulervm"
DESCRIPTION = "This package includes the documentation for texlive-eulervm"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn77682"

RPM_NAME = "texlive-eulervm-doc-2026.226.4.0svn77682-59.2.noarch.rpm"
RPM_HASH = "043c068d2a11add103768a7cf3c96eccd966a0e7263a3f381780e6d41df414156c7522d937f307855078b636f25afe2fad534320fe1f1f34bec2f3d461398c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulervm-doc"

RDEPENDS:${PN} += ""

inherit rpm
