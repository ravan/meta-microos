SUMMARY = "Documentation for texlive-parselines"
DESCRIPTION = "This package includes the documentation for texlive-parselines"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn21475"

RPM_NAME = "texlive-parselines-doc-2026.226.1.4svn21475-58.2.noarch.rpm"
RPM_HASH = "1094f1c1fbb1001f3b212d6ed1bbe02bb14352a71073d8cee15100bb4b4917572af0e66a7c4f0af9579273c6511b33cd7a16c7692678f0f3b763dcc5edaa9ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parselines-doc"

RDEPENDS:${PN} += ""

inherit rpm
