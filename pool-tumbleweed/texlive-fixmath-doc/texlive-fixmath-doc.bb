SUMMARY = "Documentation for texlive-fixmath"
DESCRIPTION = "This package includes the documentation for texlive-fixmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn76924"

RPM_NAME = "texlive-fixmath-doc-2026.226.0.0.9.1svn76924-59.2.noarch.rpm"
RPM_HASH = "16cebdaf58ba47c913652abf25073dac444cf86c320982429734d1a090d012d3fb674b68ee58c45152cb9b35327c88fd99d89cc861643fdaff730608799c66aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
