SUMMARY = "Self-service finite-state machines for the programmer on the go"
DESCRIPTION = "Automat is a library for concise, idiomatic Python expression of finite-state \
automata (particularly deterministic finite-state transducers)."
LICENSE = "MIT"

PV = "25.4.16"

RPM_NAME = "python313-Automat-25.4.16-2.5.noarch.rpm"
RPM_HASH = "240be1425f0880ec36318c3b149071bedaccb210879e14fff8caacb76843571a67dd9f9fc57edd5446bafa78f2d44e900ef3c6bdc4788d0bf560583b3ea73044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Automat \
python3.13dist-automat \
python313-Automat \
python3dist-automat"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs"

inherit rpm
