SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.18.1"

RPM_NAME = "python314-terminado-0.18.1-1.10.noarch.rpm"
RPM_HASH = "77f88b5dc704f3891a1a503dd1e2caff5b8ee66eae394c4a1b8eb7787973fd62ca94f6941caa44720eaa875cd5bdd5878bf87ad36ea52aedde1b8ea5d0074e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-terminado \
python314-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python314-ptyprocess \
python314-tornado"

inherit rpm
