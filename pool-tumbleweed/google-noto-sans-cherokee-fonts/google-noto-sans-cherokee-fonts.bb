SUMMARY = "Noto Cherokee Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cherokee Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-cherokee-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "ba1b7c41040d3f1cced9b65683b2f25729fcfa0e080180b4f0d4526c3c7a88a73c59e9f2b35db5943624f889f7a99a0648427baf9420867130867f7d8d2d2033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cherokee-fonts \
noto-sans-cherokee \
noto-sans-cherokee-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
