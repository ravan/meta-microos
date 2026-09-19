SUMMARY = "Mathematics in accord with French usage"
DESCRIPTION = "The package provides settings and macros for typesetting \
mathematics with LaTeX in compliance with French usage. It \
comes with two document classes, 'fiche' and 'cours', useful to \
create short high school documents such as tests or lessons. \
The documentation is in French."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-mafr-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "7e935fcfc25da1a421795a04a3314daaf0bc7834b138867c03ddf30b145b3edbd4bb000fa051d55bd109f31820872bd30fe370236120196dfe6defe97848629f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cours.cls \
tex-fiche.cls \
tex-mafr.sty \
texlive-mafr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-article.cls \
tex-babel.sty \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
