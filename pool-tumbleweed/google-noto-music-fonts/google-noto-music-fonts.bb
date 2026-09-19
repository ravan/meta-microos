SUMMARY = "Noto Music Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Music font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-music-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "dc88392d649b11935537769110405b6ba496454a562481495c9871a46f8c8e2a67f5cda102d4a60cfc53eb4f66cbd7e55fea7c954776bd19cf533e8b8a16421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-music-fonts \
noto-music \
noto-music-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
