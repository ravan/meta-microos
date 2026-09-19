SUMMARY = "Noto Telugu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-telugu-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "2b06e20b7f8729ef3b7a21e82217404a24d261f7e9e630a425373fce2dcf5241ade50ce814a29ed6fb4fa6293d5cb34be14dca690a401303149bb9e87314c8b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-telugu-fonts \
noto-sans-telugu \
noto-sans-telugu-fonts \
noto-sans-telugu-ui \
noto-sans-telugu-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
