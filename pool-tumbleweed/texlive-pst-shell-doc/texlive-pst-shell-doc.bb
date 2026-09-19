SUMMARY = "Documentation for texlive-pst-shell"
DESCRIPTION = "This package includes the documentation for texlive-pst-shell"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-doc-2026.226.0.0.03svn56070-60.4.noarch.rpm"
RPM_HASH = "dfe25764504a28ae2e9d2b9e191ec14a5fcc2b5732c3b75076f92911147bedbc3972f83ef4200156dbe58628396eed302c36c375f763f837e0ce34cc4c0a4439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-shell-doc"

RDEPENDS:${PN} += ""

inherit rpm
