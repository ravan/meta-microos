SUMMARY = "Documentation for texlive-spath3"
DESCRIPTION = "This package includes the documentation for texlive-spath3"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn76924"

RPM_NAME = "texlive-spath3-doc-2026.226.2.8svn76924-64.2.noarch.rpm"
RPM_HASH = "5153754b8ba5806724e616c260ba544c46979d67748c4f6e2b9171b12388e6b267248603d2e56e697f320023817e55ce3b39f6dc21f4820f2dfdc46258e7cff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spath3-doc"

RDEPENDS:${PN} += ""

inherit rpm
