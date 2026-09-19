SUMMARY = "Documentation for texlive-formation-latex-ul"
DESCRIPTION = "This package includes the documentation for texlive-formation-latex-ul"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024.03svn70507"

RPM_NAME = "texlive-formation-latex-ul-doc-2026.226.2024.03svn70507-60.2.noarch.rpm"
RPM_HASH = "d05c47a38019b4bc223e2e05786045dabb8f80b338035f7ea258e34c7fc7eaa621b2fcfc9b26593f5159eb65acc55ae471dc3cc2fe02045ffb6425dca840b934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-formation-latex-ul-doc-fr \
texlive-formation-latex-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
