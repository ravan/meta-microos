SUMMARY = "Documentation for texlive-rwth-ci"
DESCRIPTION = "This package includes the documentation for texlive-rwth-ci"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77874"

RPM_NAME = "texlive-rwth-ci-doc-2026.226.1.1svn77874-60.2.noarch.rpm"
RPM_HASH = "d71055834e53cd7e5708f835c495107692f2ac90205cc3e72e8461722308b12b90c799e50790d677256784022a5805697898a8d8ac52dd9adb21a693de56bb15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rwth-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
