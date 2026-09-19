SUMMARY = "Client library for openQA with async support"
DESCRIPTION = "A client for the openQA API based on httpx, providing both synchronous \
and asynchronous interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python314-openqa-async-1.0.0-1.1.noarch.rpm"
RPM_HASH = "3aabf225c473c8c42d2f13d19efc0d04163091b835f904b14bb156dbab06eb989e64eef4a729505252b8b5501215a6583c4b4287f16e0bfc85e2e27a26742247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-openqa-async \
python314-openqa-async \
python3dist-openqa-async"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-httpx"

inherit rpm
