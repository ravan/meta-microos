SUMMARY = "Noto Tai Tham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiTham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-taitham-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "9625b4bfcd6915cc3476153b162906cecc6590297c19539c119d431269ef3d6894a074bb864ea0802a051d6b1a5378cb6295503e0fbd90188891a2f9cdfa52e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-taitham-fonts \
noto-sans-taitham \
noto-sans-taitham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
