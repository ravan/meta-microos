SUMMARY = "French LaTeX FAQ (sources)"
DESCRIPTION = "(English version below) Ce package contient les sources de la \
faq LaTeX francophone, actuellement maintenue a jour sur un \
wiki ouvert a tous: https://www.latex-fr.net/ Si vous souhaitez \
lire la FAQ, nous vous conseillons de consulter URL ci-dessus. \
Vous pourrez egalement vous ouvrir un compte sur le wiki pour \
participer au projet (en francais). Toutes les contributions \
sont les bienvenues. Ce package est essentiellement mis a \
disposition sur le CTAN pour encourager la reutilisation de ce \
contenu, et pour en conserver une copie perenne. Le fichier \
'REUSE' contient les informations techniques pour la \
reutilisation. English version: This package contains the \
source files of the French-speaking FAQ, now hosted on an open \
wiki: https://www.latex-fr.net/ If you just want to read the \
FAQ, please visit the URL above. You're also welcome if you \
want to contribute to this resource (in French): just request \
an account, it's open to everyone. This package is on CTAN \
mostly to encourage reuse, and for archival purposes. Read the \
'REUSE' file to get technical data about reusing the contents."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71182"

RPM_NAME = "texlive-faq-fr-2026.226.svn71182-59.2.noarch.rpm"
RPM_HASH = "8532cea3365153eccca59cd36ac29f178f69b908019a6b696669184140ee0e135eb19764683e31d0b76aa0b2b82fb49b30e3a10fdd5f419423ec12b61225bf05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-faq-fr"

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
