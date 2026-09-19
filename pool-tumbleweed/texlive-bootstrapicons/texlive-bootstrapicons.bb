SUMMARY = "Icons from the framework Bootstrap"
DESCRIPTION = "The package provides over 2,000 icons from the frontend \
framework Bootstrap. Note: this is NOT an official package from \
Bootstrap."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76502"

RPM_NAME = "texlive-bootstrapicons-2026.226.1.1svn76502-59.2.noarch.rpm"
RPM_HASH = "ff8708f1b3b96a9f2228d9506fcd2c4ad9ad32d4e84a11e79d7072d64e0240013c5ed040194664ded60365dfc26ae41351f7a8b7f99df71452f1fc8ba6077970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bootstrapicons.sty \
texlive-bootstrapicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
