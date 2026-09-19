SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-idle-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "3cf7c1dff0ed7c19030ab8fb271ebf7f845ed9872b84c90f1d97b61f19d19a272b6995367dc9fbf83438166cd006fd8093589099aabb5c8c2d9980f4ef37a92e"

RPROVIDES:${PN} += "config-python312-idle \
python312-idle"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312 \
python312-tk"

inherit rpm
