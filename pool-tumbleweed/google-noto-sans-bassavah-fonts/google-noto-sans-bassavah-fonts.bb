SUMMARY = "Noto Bassa Vah Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
BassaVah Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-bassavah-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "148f8dde2b8282603a57e592d5f21d7599348c343970750292c3a7ce381ccbad6fe56889b0c6196ef3dd6a61354116c8abf88da827471aecdb7a337ad3cd830d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-bassavah-fonts \
noto-sans-bassavah \
noto-sans-bassavah-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
