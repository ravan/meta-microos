SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python314-gevent-websocket-0.10.1-2.5.noarch.rpm"
RPM_HASH = "4c32d09fc31da4c05d4d94ca19245b81209cda0d62b89b197fa20cc67a2cb4bb8d4a4fb171a54e185209f84cf747518994db6758ecfc7dd4aa673f92cf78bfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gevent-websocket \
python314-gevent-websocket \
python3dist-gevent-websocket"

RDEPENDS:${PN} += "python-abi \
python314-gevent"

inherit rpm
