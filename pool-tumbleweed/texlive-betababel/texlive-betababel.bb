SUMMARY = "Insert ancient greek text coded in Beta Code"
DESCRIPTION = "The betababel package extends the babel polutonikogreek option \
to provide a simple way to insert ancient Greek texts with \
diacritical characters into your document using the commonly \
used Beta Code transliteration. You can directly insert Beta \
Code texts -- as they can be found at the Perseus project, for \
example -- without modification."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn15878"

RPM_NAME = "texlive-betababel-2026.226.0.0.5svn15878-61.2.noarch.rpm"
RPM_HASH = "35a7a2ec5f589219f2f17acd7dceb9386b75c022bb73e13f10455128e7927d3d87353a8eddcac5b652e67debbba9156a7f157a19816b2318fb355a05c4f62b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-betababel.sty \
texlive-betababel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-teubner.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
