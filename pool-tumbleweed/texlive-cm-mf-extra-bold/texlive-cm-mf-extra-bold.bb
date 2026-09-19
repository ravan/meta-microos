SUMMARY = "Extra Metafont files for CM"
DESCRIPTION = "The bundle provides bold versions of cmcsc, cmex, cmtex and \
cmtt fonts (all parts of the standard computer modern font \
distribution), as Metafont base files."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn54512"

RPM_NAME = "texlive-cm-mf-extra-bold-2026.226.svn54512-60.2.noarch.rpm"
RPM_HASH = "447565f2cfa6e76f149210f44587a6909d5813dcd9aeb6747609dbbd6bbcc778dc580417c734f8112554cc75d4297ce8d914de55a2518de3f6d1bd3145fd9c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmbcsc10.tfm \
tex-cmbtex10.tfm \
tex-cmbtt10.tfm \
tex-cmbtt8.tfm \
tex-cmbtt9.tfm \
tex-cmttb10.tfm \
texlive-cm-mf-extra-bold"

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
