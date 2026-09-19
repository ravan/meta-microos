SUMMARY = "A survey of LaTeX documentation"
DESCRIPTION = "A survey of programming-related documentation for LaTeX. \
Included are references to printed and electronic books and \
manuals, symbol lists, FAQs, the LaTeX source code, CTAN and \
distributions, programming-related packages, users groups and \
online communities, and information on creating packages and \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70729"

RPM_NAME = "texlive-docsurvey-2026.226.svn70729-59.2.noarch.rpm"
RPM_HASH = "746106a8bc6271e3a8cd81a830c7d639f9f67daccbf15e64acb5f8071fc2e21620f1770c8609403a13829e60e5977bf39edcc84bdccb57a2c066d8fbb0069c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docsurvey"

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
