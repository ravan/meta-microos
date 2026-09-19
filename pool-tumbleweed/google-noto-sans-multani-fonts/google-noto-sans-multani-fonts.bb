SUMMARY = "Noto Multani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Multani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-multani-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "4ce47a7a9b0f6ac163eb07d50ac5ddc0d0212b02644998da5dfbe6830685418553566ab1ba949dde0d37539789fab0dd94804e1e63f547ce57634f0bd0f20c7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-multani-fonts \
noto-sans-multani \
noto-sans-multani-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
