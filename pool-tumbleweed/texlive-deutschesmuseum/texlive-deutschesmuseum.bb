SUMMARY = "A LaTeX class for contributions to Deutsches Museum publications"
DESCRIPTION = "This is a LaTeX class for contributions to Deutsches Museum \
publications."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77878"

RPM_NAME = "texlive-deutschesmuseum-2026.226.1.7svn77878-59.2.noarch.rpm"
RPM_HASH = "1544acf98f3199005552ad0f4f570b202f8519e8bb96755468a81f07c95f2dfa755a52d5c3205ff022aeebff2d1f500029de9bc96d4d5e7cafa601635400a892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-deutschesmuseum.cls \
texlive-deutschesmuseum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-amssymb.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
