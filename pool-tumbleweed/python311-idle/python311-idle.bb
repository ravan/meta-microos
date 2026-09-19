SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-idle-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "c6e24ce3ec4b77f1ce936ce5a3119da71766615107308cf94507f67bb6f7c9a4cea7d61269199e88583b534f67fa910923aabb0e3552317596ceddb14d5be256"

RPROVIDES:${PN} += "config-python311-idle \
python311-idle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python311 \
python311-tk"

inherit rpm
