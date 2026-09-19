SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-idle-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "00d79b843b93a73500647708260e89842b22455f47c72260d4f8f6fff0aa70e98b0770f659f28148b217346c1c938096531c37878b6106a74da2647d4c2dbb36"

RPROVIDES:${PN} += "config-python314-idle \
python314-idle"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
python-abi \
python314 \
python314-tk"

inherit rpm
