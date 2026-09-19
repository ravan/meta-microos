SUMMARY = "A LaTeX document class for math teachers"
DESCRIPTION = "Tango is a LaTeX document class for use by mathematics \
teachers. It requires LuaLaTeX, some LaTeX packages (see the \
complete documentation for details), and a recent version of \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.8.0svn71825"

RPM_NAME = "texlive-tango-2026.227.0.0.8.0svn71825-62.2.noarch.rpm"
RPM_HASH = "02ccc507019d0375d1288241b89a9d4b975cce47af67c1b365f05ee263d63b5992fa095d736d4a71a73877036e050dabed5fa20fae085a17e0926b8ef42fd602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tango.cls \
texlive-tango"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-caption.sty \
tex-ccaption.sty \
tex-enumitem.sty \
tex-float.sty \
tex-fontspec.sty \
tex-fourier-orns.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-iftex.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
