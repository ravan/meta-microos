SUMMARY = "Noto Math Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Math Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-math-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "075ead51ed814f5edc0782263ce69ad3cfa2f0d63bcc9ae922fe5c35df23d5019be8625708c3e77972c06b545984a9afc784a9f64894b08a62c4b11815356a58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-math-fonts \
noto-sans-math \
noto-sans-math-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
