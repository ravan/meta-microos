SUMMARY = "A Python library to handle data structure"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents)"
LICENSE = "LGPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "python314-liblarch-3.2.0-2.10.noarch.rpm"
RPM_HASH = "b344e535b2b5a1f611f6b96c4d224afe7f4cb5fbe00e97811a750e9503c97f36f2fffac563c4bb2fbee55867a9b57d58ede097f9c562978bebd7cf1e7029218a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-liblarch \
python314-liblarch \
python3dist-liblarch"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-gobject-Gdk"

inherit rpm
