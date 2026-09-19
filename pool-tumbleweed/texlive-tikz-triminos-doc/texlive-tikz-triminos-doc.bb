SUMMARY = "Documentation for texlive-tikz-triminos"
DESCRIPTION = "This package includes the documentation for texlive-tikz-triminos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73533"

RPM_NAME = "texlive-tikz-triminos-doc-2026.226.0.0.1.0svn73533-59.2.noarch.rpm"
RPM_HASH = "7a659996a83917b7fc2adc92ebb5ce35d3f48028cb22af69a8a0f939c25fee0a2408b76a93d908ebb35bfc621c68ae481c76d45368d9c161a251ade274faa0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-triminos-doc"

RDEPENDS:${PN} += ""

inherit rpm
