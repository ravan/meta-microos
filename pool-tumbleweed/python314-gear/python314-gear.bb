SUMMARY = "Pure Python Async Gear Protocol Library"
DESCRIPTION = "A pure-Python asynchronous library to interface with Gearman."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python314-gear-0.16.0-3.8.noarch.rpm"
RPM_HASH = "44e850d235d7a0aa16b99b24d6d8d76227c7dcba63f54ddc6b6e669e606ae28ef089c9201f99c51af048ed09200eb08cacd626031719febc0076c3dbd91132fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gear \
python314-gear \
python3dist-gear"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-extras \
python314-pbr \
python314-python-daemon \
python314-six \
update-alternatives"

inherit rpm
