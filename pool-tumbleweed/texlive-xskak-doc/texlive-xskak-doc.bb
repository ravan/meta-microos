SUMMARY = "Documentation for texlive-xskak"
DESCRIPTION = "This package includes the documentation for texlive-xskak"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78101"

RPM_NAME = "texlive-xskak-doc-2026.226.1.5svn78101-59.4.noarch.rpm"
RPM_HASH = "b93cc853448fb14e7ab579df87ebb916e8d9fa99f0ab408941be4cf799435e95eaca12831eca1bdd7c597a92d35bf8dafcd23ea206c7e539958a4957803458f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xskak-doc"

RDEPENDS:${PN} += ""

inherit rpm
