SUMMARY = "Noto Modi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Modi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-modi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "32b0b3f0970c7c447df05bb8865bbc4c69e81457e6255fe805ed26124df22e8819a00851cedb45bdf0ae51e9ddcd5a6c0450c987faba47cb12c48ff770a19d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-modi-fonts \
noto-sans-modi \
noto-sans-modi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
