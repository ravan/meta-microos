SUMMARY = "Noto Tai Le Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiLe Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-taile-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b1089b1a2c1797685cbaec0710b903988ee400f7bac96352483ada58cebb4b64dd74c565e934effc77abc65643579f0a01c617f5507cb3182d5cdba4c57b8270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-taile-fonts \
noto-sans-taile \
noto-sans-taile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
