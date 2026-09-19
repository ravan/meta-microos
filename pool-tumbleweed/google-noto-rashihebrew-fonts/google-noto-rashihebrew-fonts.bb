SUMMARY = "Noto Rashi Hebrew Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
RashiHebrew font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-rashihebrew-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2bed70e94933098721de421aba06201e0095dc262b1bb2362896461640ca24b25e0e255d97e30b3c8ee765edbe2c82fe5b9074da292e0c699a6a536c6d6d3b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-rashihebrew-fonts \
noto-rashihebrew \
noto-rashihebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
