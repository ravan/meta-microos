SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-idle-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "1a5f06aa70a4719844c3624a67f80a0ee16a521ce2e9afd3b513d217293bc53d31849ec53d9c40fc6726438910e68741590014f37f33c0f195c8a51cb25d1fe8"

RPROVIDES:${PN} += "config-python310-idle \
python310-idle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310 \
python310-tk"

inherit rpm
