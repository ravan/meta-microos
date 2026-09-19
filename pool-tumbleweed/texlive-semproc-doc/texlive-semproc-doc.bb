SUMMARY = "Documentation for texlive-semproc"
DESCRIPTION = "This package includes the documentation for texlive-semproc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn37568"

RPM_NAME = "texlive-semproc-doc-2026.226.0.0.1svn37568-60.2.noarch.rpm"
RPM_HASH = "a69306bb127fd746c8b362661e9f5f7f07a71a2b952b185363589cd645e3b382df03d3947288b9e78918bb74fa91610c3879ac07482e7b2ed903b57b73932985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
