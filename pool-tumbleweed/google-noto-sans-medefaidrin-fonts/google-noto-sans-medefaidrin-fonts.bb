SUMMARY = "Noto Medefaidrin Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Medefaidrin Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-medefaidrin-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "547b7df660960d1c44e099b0e230f113fd3a001ea58fd1dd84fc1ee2f7358a5063fc006e8001a0f1efdaf3a723b4ffd06d6c1181ff686ad465bf672215cea2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-medefaidrin-fonts \
noto-sans-medefaidrin \
noto-sans-medefaidrin-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
