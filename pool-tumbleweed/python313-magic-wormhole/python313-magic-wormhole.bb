SUMMARY = "Tool for transferring files through a secure channel"
DESCRIPTION = "This package provides a library and a command-line tool named wormhole, \
which makes it possible to get arbitrary-sized files and directories from \
one computer to another. The two endpoints are identified by using identical \
'wormhole codes': in general, the sending machine generates and displays \
the code, which must then be typed into the receiving machine."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "python313-magic-wormhole-0.24.0-2.1.noarch.rpm"
RPM_HASH = "d71a3d5e6dbfa5adb4786c3c3ac2c4a2994974b67ed26990a378b6b3d3bfbbb027e586623eacba17f7185d18e2a61d1b27f349ffc9f74c89eff7860a72732193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole \
python3.13dist-magic-wormhole \
python313-magic-wormhole \
python3dist-magic-wormhole"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Automat \
python313-PyNaCl \
python313-Twisted \
python313-attrs \
python313-autobahn \
python313-click \
python313-cryptography \
python313-humanize \
python313-iterable-io \
python313-noiseprotocol \
python313-qrcode \
python313-spake2 \
python313-tqdm \
python313-txtorcon \
python313-zipstream-ng \
update-alternatives"

inherit rpm
