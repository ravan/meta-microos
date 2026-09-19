SUMMARY = "Typeset Karnaugh maps"
DESCRIPTION = "This package provides an easy to use interface to typeset \
Karnaugh maps using TikZ. Though similar to the karnaugh \
macros, it provides a key-value system to customize \
karnaughmaps and a proper LaTeX package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-2026.226.2.0svn36989-63.2.noarch.rpm"
RPM_HASH = "5f34324907c0fc0210cbdd7c00180a900c3ab800f4dd4e42f771c4815845f68bf2f935927248e272174e7fe6c42aae10b7afad18d5813823cbe05f4c54852e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karnaughmap.sty \
texlive-karnaughmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
