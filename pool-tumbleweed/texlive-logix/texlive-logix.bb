SUMMARY = "Supplement to the Unicode math symbols"
DESCRIPTION = "The package provides a Unicode font with over 4,000 symbols to \
supplement the Unicode math symbols. It is compatible with and \
complements the AMS STIX2 math fonts, but focuses on new \
symbols and symbol variants more suited to work in logic."
LICENSE = "OFL-1.1"

PV = "2026.226.1.13svn63688"

RPM_NAME = "texlive-logix-2026.226.1.13svn63688-61.2.noarch.rpm"
RPM_HASH = "e1652684f43f7463495b16aa06d9d83b2ddadce12e738bdec080b5de9d930eeed5e71e70451caffe277dfe4cb7333a79eb27d7d784052160b6ef86a0bce2eb51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logix.sty \
texlive-logix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arydshln.sty \
tex-iftex.sty \
tex-mathtools.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-logix-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
