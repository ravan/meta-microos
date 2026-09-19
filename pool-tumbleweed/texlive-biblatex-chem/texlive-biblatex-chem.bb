SUMMARY = "A set of BibLaTeX implementations of chemistry-related bibliography styles"
DESCRIPTION = "The bundle offers a set of styles to allow chemists to use \
BibLaTeX. The package has complete styles for: all ACS \
journals; RSC journals using standard (Chem. Commun.) style; \
and Angewandte Chem. style, (thus covering a wide range of \
journals). A comprehensive set of examples of use is included."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn76236"

RPM_NAME = "texlive-biblatex-chem-2026.226.1.2asvn76236-61.2.noarch.rpm"
RPM_HASH = "248f13c2c91c69d8df8051fb66209097b3d968ed1deff86c9e0ce139bdaf4bf8b91673f126b379cc4bdcb78a558316fc8d4ffc888af466d71a348bfdb711e96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chem-acs.bbx \
tex-chem-acs.cbx \
tex-chem-angew.bbx \
tex-chem-angew.cbx \
tex-chem-biochem.bbx \
tex-chem-biochem.cbx \
tex-chem-rsc.bbx \
tex-chem-rsc.cbx \
texlive-biblatex-chem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
