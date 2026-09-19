SUMMARY = "Text based chat client for the Rocket.chat messaging solution"
DESCRIPTION = "rocket.term is a text based client for Rocket.chat that runs in a terminal."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "rocket.term-0.2.0-2.18.noarch.rpm"
RPM_HASH = "04bfa42c8dfe1afa45b2ea7e7f45df1f11c9817c3425b4104691a91e94102e48f73ba96848725a6a779d44a8513583bc519983ffe0b7945721ce6913c907aee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-rocket.term \
python3dist-rocket.term \
rocket.term"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-requests \
python3-urwid \
python3-websocket-client"

inherit rpm
