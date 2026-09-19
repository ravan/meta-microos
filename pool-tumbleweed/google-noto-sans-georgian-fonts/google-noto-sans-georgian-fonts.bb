SUMMARY = "Noto Georgian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Georgian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-georgian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "969f62d109f96be8a2b0215316812835aa93c3605fed3eef5f0c4ce694b465e001d68b2e8a7e1973019de41b487d9eea73854ce677ce5913028db260f3bbed66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-georgian-fonts \
noto-sans-georgian \
noto-sans-georgian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
