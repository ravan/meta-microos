SUMMARY = "Draw objects constructed from strands"
DESCRIPTION = "This package permits to draw objects constructed from strands, \
like set partitions, permutations, braids, etc. It depends on \
forarray, ifthen, TikZ, xfp, xstring, and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn59906"

RPM_NAME = "texlive-strands-2026.226.1.1svn59906-64.2.noarch.rpm"
RPM_HASH = "48403a38f3effb18f29b9619f0a58d12c0feec13b0362f19afb8e84250a01d0e487020be8ec116695715c38292ac6ec3b0e65de60782d8de807c5ec43bb17bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-strands.sty \
texlive-strands"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forarray.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xfp.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
