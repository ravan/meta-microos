SUMMARY = "A document class for the journal 'Philosophy and the Mind Sciences'"
DESCRIPTION = "This package provides a document class for the open-access \
journal Philosophy and the Mind Sciences."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn76924"

RPM_NAME = "texlive-phimisci-2026.226.1.0.2svn76924-58.2.noarch.rpm"
RPM_HASH = "621e0da33ad8317b3afb3eeb08cfc07a83c9006c17b1fb741b843e34daad6d22810ec241d7d527c509c930cbfaef580cfd352ac6d1b757029831836ee4ff33c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phimisci.cls \
texlive-phimisci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-biblatex.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-libertinus.sty \
tex-lineno.sty \
tex-lua-widow-control.sty \
tex-microtype.sty \
tex-noto-sans.sty \
tex-orcidlink.sty \
tex-scrlayer-notecolumn.sty \
tex-scrlayer-scrpage.sty \
tex-scrtime.sty \
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
