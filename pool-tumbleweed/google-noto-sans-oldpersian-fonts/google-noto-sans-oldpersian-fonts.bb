SUMMARY = "Noto Old Persian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPersian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldpersian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "337cfcffc441ab373bc4f809d40819986237b3fd248ca705b7bb3d1cb3379fe86a4154f34d7cc7227e5344b91c8eba7bf0f97e57dd7e0efa4e71131cf927a323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldpersian-fonts \
noto-sans-oldpersian \
noto-sans-oldpersian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
