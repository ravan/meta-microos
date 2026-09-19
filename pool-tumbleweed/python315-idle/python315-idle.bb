SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-idle-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "052846fb065a9a534dcdf2986dd83fb2bb21b31867e71b8e8a183f222bd0e8a5fab02a057e1697ac14dbff96739b03add9479c254b89aa28f6a38be149445c04"

RPROVIDES:${PN} += "config-python315-idle \
python315-idle"

RDEPENDS:${PN} += "/usr/bin/python3.15 \
python-abi \
python315 \
python315-tk"

inherit rpm
