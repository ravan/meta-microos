SUMMARY = "Terminals served to termjs using Tornado websockets"
DESCRIPTION = "This is a Tornado websocket backend for the term.js Javascript terminal \
emulator library. \
 \
It evolved out of pyxterm, which was part of GraphTerm (as lineterm.py), and \
ultimately derived from the public-domain Ajaxterm code (also on Github as part \
of QWeb)."
LICENSE = "BSD-2-Clause"

PV = "0.18.1"

RPM_NAME = "python313-terminado-0.18.1-1.10.noarch.rpm"
RPM_HASH = "3214a90f3a6f192d098d69979a8624154e6fcdd6aed3d52bc82bbd5b6fcf4a7d00c4bec357b5ab3ee271d0e98130a815b2892f502a0159de1fab0b6ec1107e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminado \
python3.13dist-terminado \
python313-terminado \
python3dist-terminado"

RDEPENDS:${PN} += "python-abi \
python313-ptyprocess \
python313-tornado"

inherit rpm
