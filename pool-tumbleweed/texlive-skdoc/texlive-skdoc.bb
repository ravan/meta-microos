SUMMARY = "Documentation and extraction for packages and document classes"
DESCRIPTION = "The class provides the functionality and implementation of \
packages and document classes. It is loosely based on the ydoc \
and ltxdoc classes, but has a number of incompatible \
differences. The class defines a MacroCode environment which \
offers an alternative to the usual docstrip method of \
installing packages. It has the ability to generate both \
documentation and code in a single run of a single file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn76924"

RPM_NAME = "texlive-skdoc-2026.226.1.5esvn76924-64.2.noarch.rpm"
RPM_HASH = "25e0b3a7de1ead1d6f3a270a7d4cc2d54cf27de31a1dcded23e685836dd44fdef585850e3c00303c15ac7c33a42840cfb8287ab2a07cd895517ff546bd8877aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skdoc.cls \
texlive-skdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-PTSerif.sty \
tex-atbegshi.sty \
tex-babel.sty \
tex-calc.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-everyhook.sty \
tex-expl3.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-microtype.sty \
tex-minted2.sty \
tex-multicol.sty \
tex-needspace.sty \
tex-opensans.sty \
tex-pdftexcmds.sty \
tex-scrlayer-scrpage.sty \
tex-sourcecodepro.sty \
tex-verbatim.sty \
tex-xparse.sty \
tex-xstring.sty \
tex-ydoc-code.sty \
tex-ydoc-desc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
