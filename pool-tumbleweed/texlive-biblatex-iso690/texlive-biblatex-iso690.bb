SUMMARY = "BibLaTeX style for ISO 690 standard"
DESCRIPTION = "The package provides a bibliography and citation style which \
conforms to the latest revision of the international standard \
ISO 690:2010. The implementation follows BibLaTeX conventions \
and requires BibLaTeX [?] 3.4 and biber [?] 2.5."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-2026.226.0.0.4.1svn62866-61.2.noarch.rpm"
RPM_HASH = "c8dc70839b7e363d9848f7b5f7de49db845175bb360e0fbacf5aead1f80d8fcab0d84c72ffa7da74309555648ed2237b70c3cae9ed8e1eecb9d58c91c445eba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bulgarian-iso.lbx \
tex-czech-iso.lbx \
tex-english-iso.lbx \
tex-french-iso.lbx \
tex-german-iso.lbx \
tex-iso-alphabetic.bbx \
tex-iso-alphabetic.cbx \
tex-iso-authortitle.bbx \
tex-iso-authortitle.cbx \
tex-iso-authoryear.bbx \
tex-iso-authoryear.cbx \
tex-iso-fullcite.cbx \
tex-iso-numeric.bbx \
tex-iso-numeric.cbx \
tex-iso.bbx \
tex-ngerman-iso.lbx \
tex-polish-iso.lbx \
tex-slovak-iso.lbx \
tex-spanish-iso.lbx \
texlive-biblatex-iso690"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-authortitle.cbx \
tex-authoryear.cbx \
tex-bulgarian.lbx \
tex-czech.lbx \
tex-english.lbx \
tex-french.lbx \
tex-german.lbx \
tex-ngerman.lbx \
tex-numeric.cbx \
tex-polish.lbx \
tex-slovak.lbx \
tex-spanish.lbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
