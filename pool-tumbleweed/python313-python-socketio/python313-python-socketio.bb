SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.16.3"

RPM_NAME = "python313-python-socketio-5.16.3-1.2.noarch.rpm"
RPM_HASH = "bdc3c076a39266d2eb456ba16d017d50ed473012eb2ab7c44d71ed272b000c5bd9a29c26845e7a24f648018ab4fef1b27305f78f3e6956a70ccfdbacf85e9dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socketio \
python3.13dist-python-socketio \
python313-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python313-bidict \
python313-python-engineio"

inherit rpm
