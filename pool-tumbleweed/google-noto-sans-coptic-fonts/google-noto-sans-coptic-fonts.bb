SUMMARY = "Noto Coptic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Coptic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-coptic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "f54dc7280f9cc99157d318a585c3d16c4d138000787d76aa0b640fec37fc3d5dd245757f77087c76432a63e079405c92dbc7a7e129314f731342b4f94fa6e0af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-coptic-fonts \
noto-sans-coptic \
noto-sans-coptic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
