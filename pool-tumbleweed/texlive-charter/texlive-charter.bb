SUMMARY = "Charter fonts"
DESCRIPTION = "A commercial text font donated for the common good. Support for \
use with LaTeX is available in freenfss, part of psnfss."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-charter-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "916f8eeba874646a02afec7d4141b9e1a4db5a57d0b12528e3fe6de598e6f324571ea6da9b5960b1b1f5b19bb7d11b9e7a54e6f73341324eef3020a23827b74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bchb7t.tfm \
tex-bchb7t.vf \
tex-bchb8c.tfm \
tex-bchb8c.vf \
tex-bchb8r.tfm \
tex-bchb8t.tfm \
tex-bchb8t.vf \
tex-bchbc7t.tfm \
tex-bchbc7t.vf \
tex-bchbc8t.tfm \
tex-bchbc8t.vf \
tex-bchbi7t.tfm \
tex-bchbi7t.vf \
tex-bchbi8c.tfm \
tex-bchbi8c.vf \
tex-bchbi8r.tfm \
tex-bchbi8t.tfm \
tex-bchbi8t.vf \
tex-bchbo7t.tfm \
tex-bchbo7t.vf \
tex-bchbo8c.tfm \
tex-bchbo8c.vf \
tex-bchbo8r.tfm \
tex-bchbo8t.tfm \
tex-bchbo8t.vf \
tex-bchr7t.tfm \
tex-bchr7t.vf \
tex-bchr8c.tfm \
tex-bchr8c.vf \
tex-bchr8r.tfm \
tex-bchr8t.tfm \
tex-bchr8t.vf \
tex-bchrc7t.tfm \
tex-bchrc7t.vf \
tex-bchrc8t.tfm \
tex-bchrc8t.vf \
tex-bchri7t.tfm \
tex-bchri7t.vf \
tex-bchri8c.tfm \
tex-bchri8c.vf \
tex-bchri8r.tfm \
tex-bchri8t.tfm \
tex-bchri8t.vf \
tex-bchro7t.tfm \
tex-bchro7t.vf \
tex-bchro8c.tfm \
tex-bchro8c.vf \
tex-bchro8r.tfm \
tex-bchro8t.tfm \
tex-bchro8t.vf \
texlive-charter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-charter-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
