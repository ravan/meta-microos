SUMMARY = "Severed fonts for texlive-adfsymbols"
DESCRIPTION = "The  separated fonts package for texlive-adfsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78141"

RPM_NAME = "texlive-adfsymbols-fonts-2026.226.1.5svn78141-61.2.noarch.rpm"
RPM_HASH = "baac6153a2cecb63a4115625620e08f4a57290f0478f969352124e3e461a00e73870f32b64cb2119656c63f913a8a1857ee78890cbab667f92faa8f5789c3676"
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
font-arrowsadf \
font-bulletsadf \
texlive-adfsymbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
