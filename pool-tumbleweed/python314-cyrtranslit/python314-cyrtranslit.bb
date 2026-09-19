SUMMARY = "Bi-directional Cyrillic transliteration."
DESCRIPTION = "Bi-directional Cyrillic transliteration. Transliterate Cyrillic script to Latin script and vice versa. Supports transliteration for Bulgarian, Montenegrin, Macedonian, Mongolian, Russian, Serbian, Tajik, and Ukrainian."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-cyrtranslit-1.2.0-1.4.noarch.rpm"
RPM_HASH = "1e9aceb6c754feb9aba6d0aef0747b47eaacbb58a2ba642156ddcd8517ca1e1f5a2261c8cd94fc04e83da038aabc059fd065ff4c510d084c1de0dcd7450e26de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cyrtranslit \
python314-cyrtranslit \
python3dist-cyrtranslit"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
