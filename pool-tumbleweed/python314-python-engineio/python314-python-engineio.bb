SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.13.3"

RPM_NAME = "python314-python-engineio-4.13.3-1.2.noarch.rpm"
RPM_HASH = "8c0982883204c947fa617f5082a568829758d693e67ef2d866f3a9a9a4cf3be4ce8e2bb1f231f83e472badb01c169b1363c9a16e42f41babfa7814d852cebeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-engineio \
python314-python-engineio \
python3dist-python-engineio"

RDEPENDS:${PN} += "python-abi \
python314-simple-websocket"

inherit rpm
