SUMMARY = "Noto Elymaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elymaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-elymaic-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "24296566a2703a76026f3f18c4a553739369be5c6bf79fdecd02a06686f80d7d0f3bb35545b5c719aa57250b1e799f405660d99546d17f597ee0f7ef2eef74e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-elymaic-fonts \
noto-sans-elymaic \
noto-sans-elymaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
