SUMMARY = "Creates a template for a self-extracting .dtx file"
DESCRIPTION = "The bash script dtxgen creates a template for a self-extracting \
.dtx file. It is useful for those who plan to create a new \
Documented LaTeX Source (.dtx) file."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.09svn75946"

RPM_NAME = "texlive-dtxgen-2026.226.1.09svn75946-59.2.noarch.rpm"
RPM_HASH = "6d267b62b66b941b8d074d4197fddb59474d59974ed656a07dae1b039fba5180bf402feb54106c20fd905e63892a78207950b5b3d8af72a9939047fe7a107b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgen"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dtxgen-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
