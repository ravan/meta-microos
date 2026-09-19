SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.16.3"

RPM_NAME = "python314-python-socketio-5.16.3-1.2.noarch.rpm"
RPM_HASH = "c4f6e357da0304ba98b844064be1cf2cd84396e4f67e9d0781cc03f754a6b23f2ced9fb699a03ef21847dab8c4fb6f1a5666a184dc7df3a64b494be6562e5115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-socketio \
python314-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python314-bidict \
python314-python-engineio"

inherit rpm
