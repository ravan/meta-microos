SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.6.1"

RPM_NAME = "python314-Flask-SocketIO-5.6.1-1.3.noarch.rpm"
RPM_HASH = "160c140cd8a88ef003a8a0b8e39768c966c57ee24d28f2444fb0e5fa8da34a49595db36852a93b27e132a5181160971e241d76619c771dfbed63a5f1cafbb91e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-socketio \
python314-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-Jinja2 \
python314-Werkzeug \
python314-blinker \
python314-click \
python314-python-socketio"

inherit rpm
