SUMMARY = "Euro and CE sign font"
DESCRIPTION = "Metafont source for the symbols in several variants, designed \
to fit with the Computer Modern-set text."
LICENSE = "BSD-3-Clause"

PV = "2026.226.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-2026.226.3.0bsvn25714-59.2.noarch.rpm"
RPM_HASH = "ff2dda98af32805da15e6a0ced4f76ef077ef273cb5b670070a05c2745cfe77a8c38a27ea7906d5a352e05974075b1891719649de4de795c45938e70396acb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ceit.tfm \
tex-cerm.tfm \
tex-cesl.tfm \
tex-eurobf.tfm \
tex-eurobfit.tfm \
tex-eurobfsl.tfm \
tex-euroit.tfm \
tex-euroof.tfm \
tex-eurorm.tfm \
tex-eurosl.tfm \
tex-eurosp.tfm \
texlive-euro-ce"

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
