SUMMARY = "Documentation for texlive-texdate"
DESCRIPTION = "This package includes the documentation for texlive-texdate"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn49362"

RPM_NAME = "texlive-texdate-doc-2026.227.2.0svn49362-62.2.noarch.rpm"
RPM_HASH = "70dd46be57ac726f24f915b1a81345c19203a2203e88dc552871293f629437a0546cf238344d4ccd2d7c1b37a720192bdedeb2b34083a4dfa4b1d9ec194b194d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
