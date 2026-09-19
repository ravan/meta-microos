SUMMARY = "T1-encoded versions of Haralambous old German fonts"
DESCRIPTION = "This package contains virtual fonts that offer T1-alike encoded \
variants of Yannis Haralambous's old German fonts Gothic, \
Schwabacher and Fraktur (which are also available in Adobe type \
1 format). The package includes LaTeX macros to embed the fonts \
into the LaTeX font selection scheme."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-blacklettert1-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "54fd4fa58f409a7f3a18fa5b54965eddb8eb9a0c3b2a8b5a8a21e95d022206df9b888a625e57a462252bf7f78bd515ad755f55ea6770b80a379811471eb81ef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t1yfrak.fd \
tex-tfrak.tfm \
tex-tfrak.vf \
tex-tfrakls.tfm \
tex-tfrakls.vf \
tex-tgoth.tfm \
tex-tgoth.vf \
tex-tswab.tfm \
tex-tswab.vf \
texlive-blacklettert1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbsy10.tfm \
tex-cmbx10.tfm \
tex-cmmi10.tfm \
tex-cmmib10.tfm \
tex-cmr10.tfm \
tex-cmr7.tfm \
tex-cmsy10.tfm \
tex-cmu10.tfm \
tex-ecbx1000.tfm \
tex-ecrm0700.tfm \
tex-ecrm1000.tfm \
tex-yfrak.tfm \
tex-ygoth.tfm \
tex-yswab.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
