SUMMARY = "Noto Tagalog Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tagalog Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tagalog-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "baf90edf3c6a0c0635b042e6fbcec567761e192629126652188593421bb22b934aa9000016186d372e1adfbb755cb1537d43da25b50225e5c0e62347c47db447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tagalog-fonts \
noto-sans-tagalog \
noto-sans-tagalog-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
