SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "25.4.16"

RPM_NAME = "python314-Automat-25.4.16-2.5.noarch.rpm"
RPM_HASH = "5e32294d53948809c91b64cf3f713ff331f7477e28de84d15f5b26771a5940f46bebe2b4aa54c61b77e207dc92418aef1f914bb6aef5b4d45218bdbf9c767ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-automat \
python314-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs"

inherit rpm
