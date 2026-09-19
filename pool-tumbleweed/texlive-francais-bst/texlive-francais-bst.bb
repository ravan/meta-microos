SUMMARY = "Bibliographies conforming to French typographic standards"
DESCRIPTION = "The package provides bibliographies (in French) conforming to \
the rules in 'Guide de la communication ecrite' (Malo, M., \
Quebec Amerique, 1996. ISBN 978-2-8903-7875-9). The BibTeX \
styles were generated using custom-bib and they are compatible \
with natbib."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0asvn76790"

RPM_NAME = "texlive-francais-bst-2026.226.2.0asvn76790-60.2.noarch.rpm"
RPM_HASH = "4a3e7d5123189ee9fcdf01a11f22ea2ad0bd4c02f3a81204c29548761b3802c22356dfed95d6a550ca259555b47b4c6563b1749e6440cafbaece9a8625f9cf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-francaisbst.tex \
texlive-francais-bst"

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
