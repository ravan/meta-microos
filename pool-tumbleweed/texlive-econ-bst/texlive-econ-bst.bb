SUMMARY = "BibTeX style for economics papers"
DESCRIPTION = "This is a BibTeX style file for papers in economics. It \
provides the following features: author-year type citation \
reference style used in economics papers highly customizable \
use of 'certified random order' as proposed by Ray Robson \
(2018)"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn76907"

RPM_NAME = "texlive-econ-bst-2026.226.3.3svn76907-61.4.noarch.rpm"
RPM_HASH = "85e5789aa038cf96928b5b1fa5068cb317c58df74b1c5e1a0d9b6325774fd81b3a7d258938819a04cd15f9ac1a00cd43269f3990bff5056edf8fc1686c4ff78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst"

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
