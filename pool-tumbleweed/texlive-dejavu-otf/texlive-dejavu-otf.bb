SUMMARY = "Support for the ttf and otf DejaVu fonts"
DESCRIPTION = "This package supports the free ttf-fonts from the DejaVu \
project which are available from GitHub or already part of your \
system (Windows/Linux/...), and the OpenType version of TeXGyre \
Math, which is part of any TeX distribution. The following font \
files are supported: DejaVuSans-BoldOblique.ttf \
DejaVuSans-Bold.ttf DejaVuSansCondensed-BoldOblique.ttf \
DejaVuSansCondensed-Bold.ttf DejaVuSansCondensed-Oblique.ttf \
DejaVuSansCondensed.ttf DejaVuSans-ExtraLight.ttf \
DejaVuSansMono-BoldOblique.ttf DejaVuSansMono-Bold.ttf \
DejaVuSansMono-Oblique.ttf DejaVuSansMono.ttf \
DejaVuSans-Oblique.ttf DejaVuSans.ttf \
DejaVuSerif-BoldItalic.ttf DejaVuSerif-Bold.ttf \
DejaVuSerifCondensed-BoldItalic.ttf \
DejaVuSerifCondensed-Bold.ttf DejaVuSerifCondensed-Italic.ttf \
DejaVuSerifCondensed.ttf DejaVuSerif-Italic.ttf DejaVuSerif.ttf \
texgyredejavu-math.otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-dejavu-otf-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "aa07f40a75dbffb823a6fa3d0097e5af00feecdd40fcfc414168d9141c268d3786f3f87c9b4200c03296b0408efafef7548caa5a4be1057272de41ddcf0289a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dejavu-otf.sty \
texlive-dejavu-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
