SUMMARY = "OpenType versions of the pennstander fonts (with math support)"
DESCRIPTION = "This bundle provides OpenType versions Pennstander fonts \
designed by Julius Ross. It is usable with LuaTeX or XeTeX \
engines only."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-pennstander-otf-2026.226.0.0.3asvn77682-58.2.noarch.rpm"
RPM_HASH = "07b676dd4ddffe6bbf245cba291d58e9f9893ea975f89e8247a9d17baef324e1b8c0ee48478426f85da0ab92629c247677335bcf27657e83a2813306f70874f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pennstander-otf.sty \
texlive-pennstander-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pennstander-otf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
