SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-idle-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "45222b3db250f89ccf01aa3a0c13a0d69ad721e72c7fa2a052d507dd10e84be09afc03e1c550dd8ed57a8acc748a4154f2b625e6b6f91898944af70562449757"

RPROVIDES:${PN} += "config-python313-idle \
python3-idle \
python313-idle"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
python-abi \
python313 \
python313-tk"

inherit rpm
