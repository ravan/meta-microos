SUMMARY = "Noto Soyombo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Soyombo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-soyombo-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "80dad99b0465315d404ca27e195af7db0869b24e84d30f4f055e36da8fdb6f233eae578c32811f50f84963c459aea187c71dbd4434ba8ea2ad552b1d74afeb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-soyombo-fonts \
noto-sans-soyombo \
noto-sans-soyombo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
