SUMMARY = "Publications in High Energy Physics"
DESCRIPTION = "This package aims to provide a single style file containing \
most configurations and macros necessary to write appealing \
publications in High Energy Physics. Instead of reinventing the \
wheel by introducing newly created macros, hep-paper preferably \
loads third party packages as long as they are light-weight \
enough. For usual publications it suffices to load the \
hep-paper package, without optional arguments, in addition to \
the article class."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn76220"

RPM_NAME = "texlive-hep-paper-2026.226.2.4svn76220-60.4.noarch.rpm"
RPM_HASH = "a60086bee05985cec3ac45d7e519186d7482b217c1f5a8563a5032aef6b7d4ddd51d26b763c884f01bb23d495e29e5fefc34f2929988b78e55763baed96ed5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-paper.sty \
tex-hep-revtex.sty \
tex-hep-sissa.sty \
texlive-hep-paper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-hep-acronym.sty \
tex-hep-bibliography.sty \
tex-hep-float.sty \
tex-hep-font.sty \
tex-hep-math-font.sty \
tex-hep-math.sty \
tex-hep-reference.sty \
tex-hep-text.sty \
tex-hep-title.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-parskip.sty \
tex-pdftexcmds.sty \
tex-ragged2e.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
