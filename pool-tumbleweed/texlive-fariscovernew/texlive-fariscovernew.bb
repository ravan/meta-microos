SUMMARY = "Create elegant Arabic and English title (cover) pages"
DESCRIPTION = "This LaTeX package permits to generate modern and highly \
customizable title (cover) pages for Arabic and English \
documents. It provides multiple predefined visual styles, \
dynamic color schemes, font customization options, and advanced \
geometric layouts, including layered diamond compositions. It \
is designed for use with XeLaTeX or LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78033"

RPM_NAME = "texlive-fariscovernew-2026.226.1.0svn78033-59.2.noarch.rpm"
RPM_HASH = "8bc5d9671956361000c212615e2f34cc698ab33dc2e431c925f4acfbe1aa10d9996493369ad2e38302292a5898ef630d16b3670b2f27ddf577f4700684fb2c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fariscovernew.sty \
texlive-fariscovernew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bidi.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
