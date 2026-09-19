SUMMARY = "A Metafont for rustic capitals"
DESCRIPTION = "This package contains the source for ruscap: a font for rustic \
capitals -- an ancient Roman calligraphic script -- created \
with Metafont."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn71123"

RPM_NAME = "texlive-ruscap-2026.226.1.0svn71123-60.2.noarch.rpm"
RPM_HASH = "9515644fea5ae2cedc43e76ed5e87bf4e097f2d434021c65f8ddbe4401c16d2b9710be555b4fabc76aef37968a9fc88abbcf88d46cad774f50af0b8962b3e63f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ruscap10.tfm \
texlive-ruscap"

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
