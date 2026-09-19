SUMMARY = "Bibliography and citation styles following Swiss legal practice"
DESCRIPTION = "The package provides BibLaTeX bibliography and citation styles \
for documents written in accordance with Swiss legal citation \
standards in either French or German. However, according to \
https://tex.stackexchange.com/questions/426142/bibliography-usi \
ng-biblatex-swiss-legal-not-displayed-correctly the package is \
at present outdated and does not work properly with newer \
versions of BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2asvn78219"

RPM_NAME = "texlive-biblatex-swiss-legal-2026.226.1.1.2asvn78219-61.2.noarch.rpm"
RPM_HASH = "41d058525dc4cfd9eef66b10346c912dc4b26a4a7d651f191cb904f0aac15306db9d1e691bff2b7abe3e25094ad6196a9ee14c6a743ea1261ef073c628dd7123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-swiss-legal-base.bbx \
tex-biblatex-swiss-legal-base.cbx \
tex-biblatex-swiss-legal-bibliography.bbx \
tex-biblatex-swiss-legal-bibliography.cbx \
tex-biblatex-swiss-legal-de.lbx \
tex-biblatex-swiss-legal-fr.lbx \
tex-biblatex-swiss-legal-general.bbx \
tex-biblatex-swiss-legal-general.cbx \
tex-biblatex-swiss-legal-longarticle.bbx \
tex-biblatex-swiss-legal-longarticle.cbx \
tex-biblatex-swiss-legal-shortarticle.bbx \
tex-biblatex-swiss-legal-shortarticle.cbx \
texlive-biblatex-swiss-legal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-french.lbx \
tex-ngerman.lbx \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
