SUMMARY = "Document class and bibliographic style for French law"
DESCRIPTION = "The bundle provides a toolkit intended for students writing a \
thesis in French law. It features: a LaTeX document class; a \
bibliographic style for BibLaTeX package; a practical example \
of french thesis document; and documentation. The class assumes \
use of biber and BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn39802"

RPM_NAME = "texlive-droit-fr-2026.226.1.2svn39802-59.2.noarch.rpm"
RPM_HASH = "8e5040ee864874875d6d9a4d9a469d5e9edcd6173bd55594e8a2b073b69c628d51e401c4a189425daff2b525012e9391d0bc4ce8d7596c5de10b659da0dfe179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-droit-fr.bbx \
tex-droit-fr.cbx \
tex-droit-fr.cls \
texlive-droit-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-engrec.sty \
tex-filecontents.sty \
tex-footmisc.sty \
tex-ifdraft.sty \
tex-ifluatex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-refcount.sty \
tex-verbose-ibid.bbx \
tex-verbose-ibid.cbx \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
