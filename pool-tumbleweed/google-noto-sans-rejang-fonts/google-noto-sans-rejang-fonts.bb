SUMMARY = "Noto Rejang Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Rejang Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-rejang-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9c814cdca844a581ad54909383c32989da470267e3b4bf2d4353bcc56ea79995a26902bad44848a190662d6c1604ade0514b6fe15d4aeef9d77b052a40018844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-rejang-fonts \
noto-sans-rejang \
noto-sans-rejang-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
