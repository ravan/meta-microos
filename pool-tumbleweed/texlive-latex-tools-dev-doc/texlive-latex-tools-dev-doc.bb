SUMMARY = "Documentation for texlive-latex-tools-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-tools-dev"
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_1svn77483"

RPM_NAME = "texlive-latex-tools-dev-doc-2026.226.pre_release_1svn77483-63.2.noarch.rpm"
RPM_HASH = "7230a4199fb6859d5ffca026715abdebf87278e80e976d6c2de541c45eb2beac666ab20a43cdb3fa12c7c57be8d7484003ac8239bb3e14902a932c9eae03b10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-tools-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
