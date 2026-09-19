SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.13.3"

RPM_NAME = "python313-python-engineio-4.13.3-1.2.noarch.rpm"
RPM_HASH = "8bc5966d3b5ebe833d39483ec1a6f3769e33bea0e0f129e5e7f4bd7ac30fc73c7d7a5636304986e3237b9cb51f31ad49f2c614590388765eb406b5871f595451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-engineio \
python3.13dist-python-engineio \
python313-python-engineio \
python3dist-python-engineio"

RDEPENDS:${PN} += "python-abi \
python313-simple-websocket"

inherit rpm
