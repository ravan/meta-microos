SUMMARY = "Lobster Cyrillic Font"
DESCRIPTION = "A lovely Bold Condensed Script fully loaded with hundreds of ligatures \
and alternates. \
 \
Lobster Cyrillic includes: \
- 99 Cyrillic ligatures. \
- 25 ending glyphs. \
- 100 ending ligatures. \
- 2 initial ligatures. \
- Ukrainian Hryvnia and Russian Ruble currency symbols."
LICENSE = "OFL-1.1"

PV = "1.4"

RPM_NAME = "cyreal-lobster-cyrillic-fonts-1.4-7.25.noarch.rpm"
RPM_HASH = "6ee6d91b33f1a71b793e8773e3a5a67c07e83092812c0b30357e88f3101b94a3e05683338740a40329896cc5f4a301f2f7601b4934696b9ae97b8a04ebab0875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-lobster-cyrillic-fonts \
lobster-cyrillic-fonts \
locale-ru;uk"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
