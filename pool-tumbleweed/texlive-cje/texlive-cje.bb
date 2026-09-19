SUMMARY = "LaTeX document class for CJE articles"
DESCRIPTION = "The cje article class allows authors to format their papers to \
Canadian Journal of Economics style with minimum effort. The \
class includes options for two other formats: 'review' (double \
spaced, for use at the submission stage) and 'proof' (used by \
the typesetters to prepare the proof authors will receive for \
approval)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn68656"

RPM_NAME = "texlive-cje-2026.226.1.07svn68656-60.2.noarch.rpm"
RPM_HASH = "36d80d54750039d7b6a5f73ee54f5c38a93f310edab9bc5817150440f18a84febdef27898a42ee1f69ff1975b4622ad8431e2949a0a62688e41e34df2d6bbb9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cje.cls \
tex-cjenatbib.sty \
tex-cjeupmath.sty \
texlive-cje"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-lineno.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
