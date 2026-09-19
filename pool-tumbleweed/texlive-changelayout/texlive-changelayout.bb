SUMMARY = "Change the layout of individual pages and their text"
DESCRIPTION = "The package is an extension of the changepage package to permit \
the user to change the layout of individual pages and their \
texts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn16094"

RPM_NAME = "texlive-changelayout-2026.226.1.0svn16094-59.2.noarch.rpm"
RPM_HASH = "b962098c12b156fcb9614bc627a9214e12ff72313c60fd7e6e87615b7e4d2a927782c1d5d70f1eca2126f4aa8404695f39b358ed03436c3d9ce69bf17004376c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changelayout.sty \
texlive-changelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
