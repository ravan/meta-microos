SUMMARY = "Noto Hebrew Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-hebrew-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "26f158edfd01a338794b36ae955410ec4072bedc954c5606903a3527177084a08d38648b7ca16d693f162b72fc9143f91f5677f2e916d4022d75a511db866691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hebrew-fonts \
noto-serif-hebrew \
noto-serif-hebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
