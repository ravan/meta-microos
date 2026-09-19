SUMMARY = "A command to reproduce the flag of the European Union"
DESCRIPTION = "This LaTeX package implements a command to reproduce the \
official flag of the European Union (EU). The flag is \
reproduced at 1em high based on the current font size, so it \
can be scaled arbitrarily by changing the font size."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn55265"

RPM_NAME = "texlive-euflag-2026.226.0.0.8svn55265-59.2.noarch.rpm"
RPM_HASH = "727c495c2cfcc20a8c58c009fbbd8160e9bd6d39397d0af2075939ff7c188d2d05428d81e663aa564556008f3c0473c17d07686815b17df971e7589b39c842ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euflag.sty \
texlive-euflag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
