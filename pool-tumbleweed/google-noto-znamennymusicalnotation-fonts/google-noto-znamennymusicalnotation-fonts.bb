SUMMARY = "Noto Znamenny Musical Notation Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ZnamennyMusicalNotation font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-znamennymusicalnotation-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b3bfb3c52e0e4c174d272af8d780fbc2476b6f8a2baa5c7a7347855bd849a4fdb6fe8344f5513718f31f08eef14b786f15377c53c9a3db653933f8a689042319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-znamennymusicalnotation-fonts \
noto-znamennymusicalnotation \
noto-znamennymusicalnotation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
