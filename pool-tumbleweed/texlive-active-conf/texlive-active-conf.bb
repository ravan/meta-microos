SUMMARY = "Class for typesetting ACTIVE conference papers"
DESCRIPTION = "Active-conf is a class for typesetting papers for the Active \
conference on noise and vibration control. It is initially \
intended for the 2006 conference in Adelaide, Australia. The \
class is based on article with more flexible front-matter, and \
can be customised for conferences in future years with a header \
file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn15878"

RPM_NAME = "texlive-active-conf-2026.226.0.0.3asvn15878-61.2.noarch.rpm"
RPM_HASH = "b042fff27022fb30ec23dfe2686edf7e445da03c583774a6c9df04373140e3e9d0b8016dabb969dc6fa0cbaf489ca539e4518949fbab756dc9e526a303f08037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-active-conf.cls \
texlive-active-conf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-calc.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-textcomp.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
