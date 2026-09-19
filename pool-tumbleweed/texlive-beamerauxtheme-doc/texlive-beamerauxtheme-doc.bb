SUMMARY = "Documentation for texlive-beamerauxtheme"
DESCRIPTION = "This package includes the documentation for texlive-beamerauxtheme"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-doc-2026.226.1.02asvn56087-61.2.noarch.rpm"
RPM_HASH = "9694ae1550c17f3d636d0206c97cb7e916974f0248bbdb9951f001d91fcca4920a603d9e15da6e27c60b92042b2f4711ae09cba036aaba564421744534b3ea3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerauxtheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
