SUMMARY = "Support for Malay within babel"
DESCRIPTION = "This is the babel style for Malay."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0msvn77682"

RPM_NAME = "texlive-babel-malay-2026.226.1.0msvn77682-60.2.noarch.rpm"
RPM_HASH = "eff4f4630f155c926b999961dad63b8dc8e8514240784f079bfc72a42c4c57fadcdfb28adae5d24bb8720dadfbd1eb0bb97581e321472bd30c5d294274bc55b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasam.ldf \
tex-malay.ldf \
tex-melayu.ldf \
tex-meyalu.ldf \
texlive-babel-malay"

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
