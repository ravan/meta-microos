SUMMARY = "A collection of old German-style fonts"
DESCRIPTION = "A collection of fonts that reproduce those used in 'old German' \
printing and handwriting. The set comprises Gothic, Schwabacher \
and Fraktur fonts, a pair of handwriting fonts, Sutterlin and \
Schwell, and a font containing decorative initials. In \
addition, there are two re-encoding packages for Haralambous's \
fonts, providing T1, using virtual fonts, and OT1 and T1, using \
Metafont."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49869"

RPM_NAME = "texlive-gothic-2026.226.svn49869-60.4.noarch.rpm"
RPM_HASH = "e0519ad427d27fcccf57f3656fb332c64f3b302859759760130a0dcb0cad08af7d015906598bdc52a2277c0632f4319ea2f75e3af1b9e86ce68f9697833e0dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmfrak.tfm \
tex-schwell.tfm \
tex-suet14.tfm \
tex-yfrak.tfm \
tex-ygoth.tfm \
tex-yinit.tfm \
tex-ysmfrak.tfm \
tex-yswab.tfm \
texlive-gothic"

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
