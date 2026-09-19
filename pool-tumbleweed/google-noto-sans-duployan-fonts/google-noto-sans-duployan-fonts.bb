SUMMARY = "Noto Duployan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Duployan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-duployan-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "41d4998ab92d011a85dea7941ea034e8121a0d16109eba6ecdec0207ccc4bac02632fd5f3415bc01b481f0726dae0c7d03f1302882afff8816c983dd3f8be06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-duployan-fonts \
noto-sans-duployan \
noto-sans-duployan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
