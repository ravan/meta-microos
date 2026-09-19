SUMMARY = "OpenType MonaSpace fonts with fontspec support"
DESCRIPTION = "This package provides the OpenType MonaSpace fonts with \
fontspec support for LuaLaTeX and XeTeX, with or without \
ligatures. The fonts come in five styles (Argon, Krypton, Neon, \
Radon, Xenon) and five weights (ExtraLight, Light, Regular, \
Medium, SemiBold), and with healing support. See \
https://monaspace.githubnext.com for further information."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-monaspace-otf-2026.226.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "e8622ef006701891f33af086f7bbbe62f002a3cc55125cda7a97ef986768c417f2966974cc7ab24b3de14b126f93e48f2aaf86444409c13356ba88b13058c91f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-monaspace-otf.sty \
texlive-monaspace-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-monaspace-otf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
