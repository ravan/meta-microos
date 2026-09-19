SUMMARY = "Websocket handler for the gevent pywsgi server, a Python network library"
DESCRIPTION = "Websocket handler for the gevent pywsgi server, a Python network library"
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "python313-gevent-websocket-0.10.1-2.5.noarch.rpm"
RPM_HASH = "df322dc90a3cda2c53ca9f1faf47026e89804a74806c8041b8fc97594869edb289154b6b44a987d84c7ccf6b709554b98909ea5778b2c8b6e96cf220b1edfcdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gevent-websocket \
python3.13dist-gevent-websocket \
python313-gevent-websocket \
python3dist-gevent-websocket"

RDEPENDS:${PN} += "python-abi \
python313-gevent"

inherit rpm
