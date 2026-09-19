SUMMARY = "Bibliography style for the ASCE"
DESCRIPTION = "A document class and bibliographic style that prepares \
documents in the style required by the American Society of \
Civil Engineers (ASCE). These are unofficial files, not \
sanctioned by that organization, and the files specifically \
give this caveat. Also included is a short \
documentation/example of how to use the class."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn75662"

RPM_NAME = "texlive-ascelike-2026.226.3.0svn75662-60.2.noarch.rpm"
RPM_HASH = "52ebca837163a74eaec03f423c362d6dccbb99af1ed4b95b2785b90d695ff5a21f49ec3ac36c77824634209a07568d6800733c3f8c58747d4f095047bde73861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascelike.bbx \
tex-ascelike.cbx \
tex-ascelike.cls \
texlive-ascelike"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-authblk.sty \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-babel.sty \
tex-caption.sty \
tex-endfloat.sty \
tex-float.sty \
tex-ifthen.sty \
tex-lineno.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-setspace.sty \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
