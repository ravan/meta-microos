SUMMARY = "Provides (x)colors of catppuccin theme"
DESCRIPTION = "'Catppuccin' is a nice pastel theme in four flavours/styles \
(Latte, Frappe, Macchiato, Mocha). This package defines these \
themes as xcolor colors."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn75934"

RPM_NAME = "texlive-catppuccinpalette-2026.226.1.2.0svn75934-59.2.noarch.rpm"
RPM_HASH = "8af364806f23479b0ab1dcf8dfb143fd6d028eb3de4e3c0dd639b92c2308ce0889023829d7203553819910a95da404d66872c647a0207bda72938366994c4911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemecatppuccin.sty \
tex-catppuccinpalette.sty \
texlive-catppuccinpalette"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
