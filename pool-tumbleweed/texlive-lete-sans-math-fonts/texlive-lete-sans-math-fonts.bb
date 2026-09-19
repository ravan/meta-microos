SUMMARY = "Severed fonts for texlive-lete-sans-math"
DESCRIPTION = "The  separated fonts package for texlive-lete-sans-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.50svn77682"

RPM_NAME = "texlive-lete-sans-math-fonts-2026.226.0.0.50svn77682-61.2.noarch.rpm"
RPM_HASH = "5852688f530660ee9b0fa2421ff46222c1436512d993147e7a275504098e3328d60cb5269adcad01b2936c2acf5351a0030b4ba5099c1e543dce070abbb649db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bem \
font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=und-zmth \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-letesansmath \
texlive-lete-sans-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
