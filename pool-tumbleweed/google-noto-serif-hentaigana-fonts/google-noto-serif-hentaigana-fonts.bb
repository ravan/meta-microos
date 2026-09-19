SUMMARY = "Noto Hentaigana Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hentaigana Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-hentaigana-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "921b4c1004ac798e8ae872fd3caf26a9ac81ccfe3f9ed3fcce8d0d0fd88e1cf9b48dd5f3b45256d29eaf7a8aa3ea72398b5d3b47969d3b8898ebcb122ef7440c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hentaigana-fonts \
noto-serif-hentaigana \
noto-serif-hentaigana-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
