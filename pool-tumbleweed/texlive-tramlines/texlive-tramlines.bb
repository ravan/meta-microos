SUMMARY = "A package for creating tramlines (lines above and below a title used by lawyers in the UK)"
DESCRIPTION = "This package automatically creates tramlines (lines above and \
below a title used by lawyers in the UK and the Commonwealth)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71842"

RPM_NAME = "texlive-tramlines-2026.226.1.1.1svn71842-59.2.noarch.rpm"
RPM_HASH = "36cb4e84e761a8c467d4e6596d6f749b2a58ab84dade49f2da6646bc8b7a3a4f0e43676ef35e4d491b98564df2a122534136bcf3ef2ebe50d46385b2e989d36e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tramlines.sty \
texlive-tramlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
