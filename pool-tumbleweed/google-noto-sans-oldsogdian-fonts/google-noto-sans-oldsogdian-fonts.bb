SUMMARY = "Noto Old Sogdian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldSogdian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-oldsogdian-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d20f262798d6fb21fd21b1db88b2df7e75f4e247c354ab3eaf0b2bf90bbc626127fdb3f42867c1ac5aff93618b076fbd94570c4c1190dfb235e5235b6efffd01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-oldsogdian-fonts \
noto-sans-oldsogdian \
noto-sans-oldsogdian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
