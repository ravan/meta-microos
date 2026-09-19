SUMMARY = "Noto Tibetan Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tibetan Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-tibetan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "16e353f1c859d9868996c444a66d491e6510daab0590a910456e53531ef66d93d724f95578dc8a6abd5c70cd4f8f659d64112a946d75547b7437358f18940ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tibetan-fonts \
noto-sans-tibetan \
noto-sans-tibetan-fonts \
noto-serif-tibetan \
noto-serif-tibetan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
