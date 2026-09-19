SUMMARY = "Proton VPN core library"
DESCRIPTION = "This package contains core logic used by the other Proton components."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "python314-proton-core-0.7.0-2.2.noarch.rpm"
RPM_HASH = "266e8ce58c77abb2928804d1f5ff6bb56f9bbcd56490ed75fd88aa25cf9b304a7c11d1659fab84b0012e16c2981814ff4c972dd8ec7ca2a40916670c7fda0b36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proton-core \
python314-proton-core \
python3dist-proton-core"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-bcrypt \
python314-gnupg \
python314-importlib-metadata \
python314-pyOpenSSL \
python314-requests"

inherit rpm
