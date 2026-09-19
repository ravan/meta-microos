SUMMARY = "Noto Balinese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-balinese-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "03f6235f583c0c3c0efc1ca30bc42e0617c757ec5a4b8bd909213606b4d0d79af7ff3d24f1c9dbeca862795ec70b968bc9ea69460d43a697ffe1418b4df5e09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-balinese-fonts \
noto-sans-balinese \
noto-sans-balinese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
