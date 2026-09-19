SUMMARY = "Automated creation of numeric entity labels"
DESCRIPTION = "Packages provides creation of sequential numeric labels for \
entities in a document. The motivating example is chemical \
structures in a scientific document. The package can \
automatically output a full object name and label on the first \
occurrence in the document and just labels only on subsequent \
references."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12asvn76924"

RPM_NAME = "texlive-chemsec-2026.226.1.12asvn76924-60.2.noarch.rpm"
RPM_HASH = "acfbed104c0663ccf9ce960180278ef63b5f8cfe716cbcc1b236ac084a1bc4e7f2019469031ab5747b2b28fdccbe8e6aa70b495370e09fdfaeb7b8057570069e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemsec.sty \
texlive-chemsec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
