SUMMARY = "Proton VPN core library"
DESCRIPTION = "This package contains core logic used by the other Proton components."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "python313-proton-core-0.7.0-2.2.noarch.rpm"
RPM_HASH = "820fa3b24a09302bc3c818269890b4d9ec9091d8040b51ffc4f8dd346edd6cdd1aedd9ae91e24d27272a2b25bb026c55d69581f4e5e76efd403037947e2981f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-core \
python3.13dist-proton-core \
python313-proton-core \
python3dist-proton-core"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-bcrypt \
python313-gnupg \
python313-importlib-metadata \
python313-pyOpenSSL \
python313-requests"

inherit rpm
