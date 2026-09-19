SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.6.1"

RPM_NAME = "python313-Flask-SocketIO-5.6.1-1.3.noarch.rpm"
RPM_HASH = "aa635df198a996e829278da53e1adeaebd315a2d20bfcfd145929f39286835c4c706cdebfde438b3d48930e01f8630a49f265cd5f74223768c60776882feca18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SocketIO \
python3.13dist-flask-socketio \
python313-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-Jinja2 \
python313-Werkzeug \
python313-blinker \
python313-click \
python313-python-socketio"

inherit rpm
