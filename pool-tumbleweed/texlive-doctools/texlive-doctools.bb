SUMMARY = "Tools for the documentation of LaTeX code"
DESCRIPTION = "The package provides a collection of tools for use either in an \
'ordinary' LaTeX document, or within a .dtx file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34474"

RPM_NAME = "texlive-doctools-2026.226.0.0.1svn34474-59.2.noarch.rpm"
RPM_HASH = "51b9d323d6c9aae6e19290e3f842909ae9ffcd0bacb12f22b61b94350c80aba289119636b8e1a2752fcbe9ead62b175fb135cc0a69ef221731faaf89ad165722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doctools.sty \
texlive-doctools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-cmap.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-kvoptions-patch.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-listings.sty \
tex-pdftexcmds.sty \
tex-textcomp.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
