SUMMARY = "Typeset technical and scientific Brazilian documents based on ABNT rules"
DESCRIPTION = "The bundle provides support for typesetting technical and \
scientific Brazilian documents (like academic thesis, articles, \
reports, research project and others) based on the ABNT rules \
(Associacao Brasileira de Normas Tecnicas). It replaces the old \
abntex."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-2026.226.1.9.7svn49248-61.2.noarch.rpm"
RPM_HASH = "35bd883c3d6ddb0aafb62d300dba946c92e4ebccbbc4c931611e775a2b4de9c4066252bdb72defb2f7e40d5544aa15cbcd597894a6959450d8585b9b2e873b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abntex2.cls \
tex-abntex2abrev.sty \
tex-abntex2cite.sty \
texlive-abntex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-enumitem.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-memoir.cls \
tex-relsize.sty \
tex-setspace.sty \
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
