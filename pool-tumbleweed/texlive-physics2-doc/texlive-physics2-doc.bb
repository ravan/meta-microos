SUMMARY = "Documentation for texlive-physics2"
DESCRIPTION = "This package includes the documentation for texlive-physics2"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn69369"

RPM_NAME = "texlive-physics2-doc-2026.226.1.0.1svn69369-58.2.noarch.rpm"
RPM_HASH = "dd70d94cf758c5a8c945783763019b0896bc3c913f437ab4b971fee7457a5bbce5acead2fc2fc286625b679227b48fa0c1286e3320f9aa564a13d68295e2897c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics2-doc"

RDEPENDS:${PN} += ""

inherit rpm
