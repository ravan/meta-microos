SUMMARY = "Format menu sequences, paths and keystrokes from lists"
DESCRIPTION = "This package is designed to format menu sequences, paths and \
keyboard shortcuts automatically. There are several predefined \
styles and one can define one's own styles in a flexible way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.2svn77682"

RPM_NAME = "texlive-menukeys-2026.226.1.6.2svn77682-61.2.noarch.rpm"
RPM_HASH = "a3237fc9c947c32f0eebd0926e80e7e3047a271b0fc911d04a5178fb7d4869d9ba8caaca2f4554a51a6e3c53d2e21185987779432872ad19cf78e9e1378cdb39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menukeys-2020-12-19.sty \
tex-menukeys.sty \
texlive-menukeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-relsize.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
