SUMMARY = "Documentation for texlive-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-twemojis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1_twemoji_v14.0.1svn77682"

RPM_NAME = "texlive-twemojis-doc-2026.226.1.3.1_twemoji_v14.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "03fe03c104ed8d4ec317013bc6be53ff8066b1421d73dedfc510c316b9db762cbf5eabe47fc4a077132fb7e59fb3068cb16c5d035a84a13ee37ed7d1ea8894eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemojis-doc"

RDEPENDS:${PN} += ""

inherit rpm
