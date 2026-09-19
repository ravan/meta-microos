SUMMARY = "Astronomical (planetary) symbols"
DESCRIPTION = "Astrosym is a font containing astronomical symbols, including \
those used for the planets, four planetoids, the phases of the \
moon, the signs of the zodiac, and some additional symbols. The \
font is distributed as Metafont source."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.20svn15878"

RPM_NAME = "texlive-astro-2026.226.2.20svn15878-60.2.noarch.rpm"
RPM_HASH = "d134703642c3a8759cdb93df0020f06f979a0c2d491f44b6e0f0e5467c1d4dd8be3db5dafe74f8481556365033b0bbd51ef59623835c6b81903dd198df5e983e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-astrosym.tfm \
texlive-astro"

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
