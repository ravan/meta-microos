SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.7"

RPM_NAME = "python314-wsaccel-0.6.7-1.11.aarch64.rpm"
RPM_HASH = "621c31f4a4cf8a99f7eb9e73124b884261fb8cfcc94d67313f52b998aa653552a50eb799ad46261ed4177784a8171e26a750112afc92e11ccf4dbf779cf5f3fc"

RPROVIDES:${PN} += "python3.14dist-wsaccel \
python314-wsaccel \
python3dist-wsaccel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
