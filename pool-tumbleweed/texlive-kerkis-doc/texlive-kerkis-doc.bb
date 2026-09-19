SUMMARY = "Documentation for texlive-kerkis"
DESCRIPTION = "This package includes the documentation for texlive-kerkis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11svn56271"

RPM_NAME = "texlive-kerkis-doc-2026.226.1.11svn56271-63.2.noarch.rpm"
RPM_HASH = "538f69e7f603f77015a544c1973645362340dcca0afc272233e71add1c4b66af077b012ca78700a9b41a539f815642380c9cc9a37483008acbdf1629e1ec6ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerkis-doc"

RDEPENDS:${PN} += ""

inherit rpm
