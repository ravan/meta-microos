SUMMARY = "Bi-directional Cyrillic transliteration."
DESCRIPTION = "Bi-directional Cyrillic transliteration. Transliterate Cyrillic script to Latin script and vice versa. Supports transliteration for Bulgarian, Montenegrin, Macedonian, Mongolian, Russian, Serbian, Tajik, and Ukrainian."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-cyrtranslit-1.2.0-1.4.noarch.rpm"
RPM_HASH = "411990091d86bd73ef05ab3d75ea42ee374d3767daa425ce8c3d287ccf6b996484feb9f642a7515848b273b2033dc1c025de1bcec3f3ed64791b6e906e648260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cyrtranslit \
python3.13dist-cyrtranslit \
python313-cyrtranslit \
python3dist-cyrtranslit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
