SUMMARY = "Make posters and banners with TeX"
DESCRIPTION = "The package offers macros for making posters and banners with \
TeX. It is compatible with most TeX macro formats, including \
Plain TeX, LaTeX, AmSTeX, and AmS-LaTeX. The package creates a \
poster as huge box, which is then distributed over as many \
printer pages as necessary. The only special requirement is \
that your printer not be bothered by text that lies off the \
page. This is true of most printers, including laser printers \
and PostScript printers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn18305"

RPM_NAME = "texlive-poster-mac-2026.226.1.1svn18305-59.2.noarch.rpm"
RPM_HASH = "6742ae5b297609b28d310c7525a60e16c1e9fd58d18f4b333a4dc6d19d74b6153727ce7fef67a371ce21762fb12d868acca93e6b610ea29db9910f4fd07da63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poster.sty \
tex-poster.tex \
texlive-poster-mac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
