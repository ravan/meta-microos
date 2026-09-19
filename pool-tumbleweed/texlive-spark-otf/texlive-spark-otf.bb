SUMMARY = "Support OpenType Spark fonts"
DESCRIPTION = "The package supports the free fonts from 'After the Flood' \
which are available from AtF Spark. The following fonts are \
supported: Spark -- Bar -- Medium Spark -- Bar -- Narrow Spark \
-- Bar -- Thin Spark -- Dot-line -- Medium Spark -- Dot -- \
Medium Spark -- Dot -- Small"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.05asvn77682"

RPM_NAME = "texlive-spark-otf-2026.226.0.0.05asvn77682-64.2.noarch.rpm"
RPM_HASH = "64cf83c8368ad6b5f78952cfc7c92f56f373066d501cef326a20758278bf38ff95c617b3ab286c7a6d6e91cad07fffc02e47cf83e6e590290dc0306b3cd9d112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spark-otf.sty \
texlive-spark-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-spark-otf-fonts"

inherit rpm
