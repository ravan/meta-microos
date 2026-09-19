SUMMARY = "Template for theses at the Department of Chemistry, University of Jyvaskyla"
DESCRIPTION = "This is a template for producing Bachelor and Master theses \
according to the guidelines by the Department of Chemistry, \
University of Jyvaskyla. The formatting follows the guide \
'Tieteellisen opinnaytetyon kirjoitusohje'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77876"

RPM_NAME = "texlive-jyu-chem-thesis-2026.226.1.0svn77876-63.2.noarch.rpm"
RPM_HASH = "82bf45608ca39f5c8883543d7448b57c709af195c74472cb569f143020f494d4911ef2e6ed3a2d7becd6b354d3b8878f4d6cc3588e3ac50d02620d504548de65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jyu-chem-thesis.bbx \
tex-jyu-chem-thesis.cbx \
texlive-jyu-chem-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.cbx \
tex-numeric.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
