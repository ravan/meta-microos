SUMMARY = "Approximate smooth function graphs with cubic bezier splines for use with TikZ or MetaPost"
DESCRIPTION = "This package consists of a Lua program as well as a (Lua)LaTeX \
.sty file. Given a smooth function, bezierplot returns a smooth \
bezier path written in TikZ notation (which also matches \
MetaPost) that approximates the graph of the function. For \
polynomial functions of degree [?] 3 and their inverses the \
approximation is exact (up to numeric precision). bezierplot \
also finds special points such as extreme points and inflection \
points and reduces the number of used points."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn72750"

RPM_NAME = "texlive-bezierplot-2026.226.1.6svn72750-61.2.noarch.rpm"
RPM_HASH = "00e4ecca4fe2d8e48beb29b7ed3a8bf6509d42b225a234b6896b11e81b69c1717bfd4af6b17f020e53754710d22e3a3f713007536e9917c445666aba4dcfe3cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bezierplot.sty \
texlive-bezierplot"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
