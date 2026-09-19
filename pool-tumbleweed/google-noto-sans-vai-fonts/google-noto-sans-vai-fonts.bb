SUMMARY = "Noto Vai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-vai-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ad487c5b3257c4ede5041ca6ea63f34bd1fde0c84c9a71d52e92dde772b7fb12cfde9b2c9c48b0e402de4a948f7c41252b00d7a78ae5aba2073686f01a710cd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-vai-fonts \
noto-sans-vai \
noto-sans-vai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
