SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python314-magic-wormhole-0.24.0-2.1.noarch.rpm"
RPM_HASH = "6ea020acb935ecc0ef52d97564ec083738b7b83d66da441a4e27023c2f1733cb5c820a4d1d82e0961722ffbb5996a01b705ff17683ae63067e3137daa0f908df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-magic-wormhole \
python314-magic-wormhole \
python3dist-magic-wormhole"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Automat \
python314-PyNaCl \
python314-Twisted \
python314-attrs \
python314-autobahn \
python314-click \
python314-cryptography \
python314-humanize \
python314-iterable-io \
python314-noiseprotocol \
python314-qrcode \
python314-spake2 \
python314-tqdm \
python314-txtorcon \
python314-zipstream-ng \
update-alternatives"

inherit rpm
