SUMMARY = "Noto Sunuwar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sunuwar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-sunuwar-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d54d22a3c06f385b030eff25396511b2711771bca7835bb255665658a789919e9a35a3858ca3056626f57dda47d134802148bfb54cfee56de8f8fdfa5029120d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sunuwar-fonts \
noto-sans-sunuwar \
noto-sans-sunuwar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
