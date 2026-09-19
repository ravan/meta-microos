SUMMARY = "Introducing scientific/mathematical documents using LaTeX"
DESCRIPTION = "'Writing Scientific Documents Using LaTeX' is an article \
introducing the use of LaTeX in typesetting scientific \
documents. It covers the basics of creating a new LaTeX \
document, special typesetting considerations, mathematical \
typesetting and graphics. It also touches on bibliographic data \
and BibTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.5th_editionsvn15878"

RPM_NAME = "texlive-intro-scientific-2026.226.5th_editionsvn15878-60.2.noarch.rpm"
RPM_HASH = "302d71e0ce7ce237c27903e9bb27d67cad86907c688d0aea0ea34702de4f21d41075bf63576de2baf42251f15bbfe83752a3e3deb1c9bb9e5faca877640765f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intro-scientific"

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
