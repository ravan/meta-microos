SUMMARY = "Accelerator for ws4py and AutobahnPython"
DESCRIPTION = "WSAccell is WebSocket accelerator for `AutobahnPython <http://autobahn.ws/python>`_, \
`ws4py <https://github.com/Lawouach/WebSocket-for-Python>`_ and \
`Tornado <http://www.tornadoweb.org/>`_."
LICENSE = "Apache-2.0"

PV = "0.6.7"

RPM_NAME = "python313-wsaccel-0.6.7-1.11.aarch64.rpm"
RPM_HASH = "34db2a2d8e34eb58ecb7707dd376055e8466ae483461b0ecb3570ab2d615993096697b33959bd3eece7b4c01959d2ee41f5d6061772a9b60a9664d10eb2db6f7"

RPROVIDES:${PN} += "python3-wsaccel \
python3.13dist-wsaccel \
python313-wsaccel \
python3dist-wsaccel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
