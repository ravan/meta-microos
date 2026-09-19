SUMMARY = "Noto Indic Siyaq Numbers Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
IndicSiyaqNumbers Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-indicsiyaqnumbers-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "073d393b53d2288344c7cb2c749996115f2f82dedbe4208b0eb8d5ad3ba9dcc06312c026f0a0db7d671584f221b45448ddf4cbf0a30159a1e0153a86fa3aadb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-indicsiyaqnumbers-fonts \
noto-sans-indicsiyaqnumbers \
noto-sans-indicsiyaqnumbers-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
