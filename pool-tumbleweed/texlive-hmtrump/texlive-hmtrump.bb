SUMMARY = "Describe card games"
DESCRIPTION = "This package provides a font with LuaLaTeX support for \
describing card games."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-2026.226.1.2asvn54512-60.4.noarch.rpm"
RPM_HASH = "1622844271b94dc55481021928c6e106d9e26c081383d4c3950c55dac7c2f9a9d630d96e3f583d76e2086a1d0cbdbf1c23c0e5563f2edff758d9aeefdded2b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hmtrump.sty \
texlive-hmtrump"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-hmtrump-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
