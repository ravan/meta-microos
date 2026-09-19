SUMMARY = "Introductory LaTeX course in French"
DESCRIPTION = "This package contains the supporting documentation, slides, \
exercise files, and templates for an introductory LaTeX course \
(in French) prepared for Universite Laval, Quebec, Canada."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024.03svn70507"

RPM_NAME = "texlive-formation-latex-ul-2026.226.2024.03svn70507-60.2.noarch.rpm"
RPM_HASH = "6866312e93f258e5d1803aae66b09c1a3aec169bfde5afca6e2d29186f04d5470923bdb03667105459257d8804bad94862ca557a6d2220b86d43df8702629453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formation-latex-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
