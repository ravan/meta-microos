SUMMARY = "Severed fonts for texlive-erewhon-math"
DESCRIPTION = "The  separated fonts package for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78171"

RPM_NAME = "texlive-erewhon-math-fonts-2026.226.0.0.73svn78171-61.4.noarch.rpm"
RPM_HASH = "97832d6aafc67313ddb13f63781d816b370cc1cd15cf19d78e600bb77f10076f31883342a98aa77e2238d168e2ae781403fe2e87813dea34214bccf95e0706f0"
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
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-erewhonmath \
texlive-erewhon-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
