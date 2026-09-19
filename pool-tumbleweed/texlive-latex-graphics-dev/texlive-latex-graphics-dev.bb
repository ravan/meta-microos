SUMMARY = "Development pre-release of the LaTeX graphics bundle"
DESCRIPTION = "This is a pre-release version of the standard LaTeX graphics \
bundle. It accompanies the pre-testing kernel code \
(latex-base-dev), and is intended for testing by knowledgeable \
users."
LICENSE = "LPPL-1.0"

PV = "2026.226.pre_release_0svn76722"

RPM_NAME = "texlive-latex-graphics-dev-2026.226.pre_release_0svn76722-63.2.noarch.rpm"
RPM_HASH = "1284695145313d4deb94d08f1a3f56d6c2c132e019859a989817259f9e455e4478167226e46d367f1fc16e91531f2789a5a758c17c1e0e718a82c5cf6411c2ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-color.sty \
texdev-dvipdf.def \
texdev-dvipsnam.def \
texdev-dvipsone.def \
texdev-dviwin.def \
texdev-emtex.def \
texdev-epsfig.sty \
texdev-graphics-2017-06-25.sty \
texdev-graphics.sty \
texdev-graphicx.sty \
texdev-keyval.sty \
texdev-lscape.sty \
texdev-pctex32.def \
texdev-pctexhp.def \
texdev-pctexps.def \
texdev-pctexwin.def \
texdev-rotating.sty \
texdev-tcidvi.def \
texdev-trig.sty \
texdev-truetex.def \
texlive-latex-graphics-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texdev-ifthen.sty \
texlive \
texlive-filesystem \
texlive-graphics-cfg \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
