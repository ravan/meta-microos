SUMMARY = "Noto Mende Kikakui Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MendeKikakui Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-mendekikakui-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2e2619daee1a7f6256c92676829d8e9e97e59b274e72e28fd1a2279c54910b398042871f4ab530ba0e1e6b15f195a5a5dd3613ed735c6420a7743dbef9d872c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-mendekikakui-fonts \
noto-sans-mendekikakui \
noto-sans-mendekikakui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
