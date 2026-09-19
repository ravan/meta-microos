SUMMARY = "Severed fonts for texlive-punknova"
DESCRIPTION = "The  separated fonts package for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.003svn24649"

RPM_NAME = "texlive-punknova-fonts-2026.226.1.003svn24649-60.4.noarch.rpm"
RPM_HASH = "a714c4a25d0c80936f8c894ed39187f218d5ce79ca3bb62cafa0bd4eec9c88e3ece92fe60cc1ec7ebd827c78cae5fbd2291dca70162c6d67d8a246514127c07f"
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
font-punknova \
texlive-punknova-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
