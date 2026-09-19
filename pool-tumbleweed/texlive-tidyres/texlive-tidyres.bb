SUMMARY = "Create formal resumes easily"
DESCRIPTION = "This LaTeX package aims to provide users with a simple \
interface to create multi-column formal resumes."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0.0svn67738"

RPM_NAME = "texlive-tidyres-2026.227.2.0.0svn67738-62.2.noarch.rpm"
RPM_HASH = "85acc9e54c5f402a7ae4b9334afacbe7a75af8bb07b7c73e5aa273c48dedda72910a1f0aec556bcb7e4a4b2315ad67fee7448690997718d7ff1ad0fbfe5ed6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tidyres.sty \
texlive-tidyres"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-enumitem.sty \
tex-expkv-cs.sty \
tex-expkv-def.sty \
tex-fontawesome.sty \
tex-fontspec.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-minted.sty \
tex-paracol.sty \
tex-setspace.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
