SUMMARY = "BibTeX style for Frontiers in Bioscience"
DESCRIPTION = "A BibTeX style file made with custom-bib to fit Frontiers in \
Bioscience requirements: all authors, no et al, full author \
names, initials abbreviated; only abbreviated journal name \
italicised, no abbreviation dots; only year, no month, at end \
of reference; and DOI excluded, ISSN excluded."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-fbs-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "3a6382d8ac0e542fdb319da71dbbce05796c497bc86ef7c9bafade7d331f1fe9580b0793c226df1e6b55b5b8be2a834f8bbbcb2b25151b078422d80ac9ee1839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbs"

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
