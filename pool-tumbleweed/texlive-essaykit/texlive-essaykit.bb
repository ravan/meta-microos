SUMMARY = "Get started with macros for essays"
DESCRIPTION = "Essaykit is a simple but useful package to help writing simple \
LaTeX essays using some shortcuts and tools. The goal of the \
package is to accelerate the learning curve for new LaTeX \
users. It is mainly for short STEM essays such as those made in \
high school."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77253"

RPM_NAME = "texlive-essaykit-2026.226.2.0svn77253-59.2.noarch.rpm"
RPM_HASH = "0d2cc81840f53dacb3a2677a3a2f2172ceee58487816ebb0e05d931b2468caac73c47c012f416e90c1743889b5745111f9c01e085eaeec4b5bd06e16a5901850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-essaykit.sty \
texlive-essaykit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-chemfig.sty \
tex-enumitem.sty \
tex-graphicx.sty \
tex-imakeidx.sty \
tex-keyval.sty \
tex-tcolorbox.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
