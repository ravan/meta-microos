SUMMARY = "Bibliography of 'Die TeXnische Komodie'"
DESCRIPTION = "This package contains the bibliography for 'Die TeXnische \
Komodie', the journal of the German-speaking TeX User Group. It \
is updated on a quarterly basis."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_11svn76870"

RPM_NAME = "texlive-dtk-bibliography-2026.226.2025_11svn76870-59.2.noarch.rpm"
RPM_HASH = "8b8c6fe06a2bf8a8ccc71491281005ed2bba63d56bc9f0af659e2724aabb563a00aa57c70674e9019c4884b89b175d7440cfef4e6babce936736608b5736e7da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtk-authoryear.bbx \
tex-dtk-logos.sty \
texlive-dtk-bibliography"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-dantelogo.sty \
tex-fetamont.sty \
tex-hologo.sty \
tex-iftex.sty \
tex-unicode-math.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
