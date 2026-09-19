SUMMARY = "Documentation for texlive-nimbus15"
DESCRIPTION = "This package includes the documentation for texlive-nimbus15"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.015svn72894"

RPM_NAME = "texlive-nimbus15-doc-2026.226.1.015svn72894-61.2.noarch.rpm"
RPM_HASH = "8589da539de3edc1f117688d00970179336bd992aa96d0972210622310146b9caf5426400b708d2302c9128a9dacab3a07877d4aee6a48191a40afd6944129be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimbus15-doc"

RDEPENDS:${PN} += ""

inherit rpm
