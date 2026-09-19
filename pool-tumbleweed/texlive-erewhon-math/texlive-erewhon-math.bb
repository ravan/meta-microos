SUMMARY = "Utopia based OpenType Math font"
DESCRIPTION = "OpenType version of the fourier Type1 fonts designed by Michel \
Bovani."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78171"

RPM_NAME = "texlive-erewhon-math-2026.226.0.0.73svn78171-61.4.noarch.rpm"
RPM_HASH = "2cf9d6d9a742e8e34d946fdb7d6c69e23297ce4bc53be63be61ebce2bb8ce60601e9f2b2cf17277903b9662595ae5dd25b92e9866db8501a0dcce2e37d41a4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fourier-otf.sty \
texlive-erewhon-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-fourier-orns.sty \
tex-iftex.sty \
tex-lua-unicode-math.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
texlive \
texlive-erewhon-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
