SUMMARY = "Function-driven python GUI programming"
DESCRIPTION = "EasyGui provides an interface for simple GUI interaction with a user. \
It's not event-driven and it does not require the programmer to know \
anything about tkinter, frames, widgets, callbacks or lambda."
LICENSE = "BSD-3-Clause"

PV = "0.98.3"

RPM_NAME = "python314-easygui-0.98.3-3.5.noarch.rpm"
RPM_HASH = "068cf6ac04d02f3b74d537b2d4d949905fc60cf2537c2b64be821454be16a265b254bbf6781a63921298d2b358320c8846b1fada60b44c6a0d43cae71900ffa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-easygui \
python314-easygui \
python3dist-easygui"

RDEPENDS:${PN} += "python-abi"

inherit rpm
