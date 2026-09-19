SUMMARY = "Provides various Unicode symbols"
DESCRIPTION = "This package provides various symbols from the Unicode in order \
to be able to use them originally in a school setting such as \
on worksheets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-2026.226.0.0.9.0svn63076-60.2.noarch.rpm"
RPM_HASH = "585eb04362e53d8dd8df3432dafd485753b1fee91f98855a971416c35d1e653801eca74e54fd88d9d63c2e0d63829393f33a64e6bbe44de2dd5fc2e45c4b2634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utfsym.sty \
texlive-utfsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-newunicodechar.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
