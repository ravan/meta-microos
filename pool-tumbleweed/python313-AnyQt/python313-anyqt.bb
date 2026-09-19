SUMMARY = "PyQt4/PyQt5 compatibility layer"
DESCRIPTION = "PyQt4/PyQt5 compatibility layer. \
 \
Features include: \
 \
* At the top level, AnyQt exports a Qt5 compatible module namespace along with \
  some minimal renames to better support portability between different \
  versions. \
* The 'QT_API' environment variable controls which Qt API/backend is used. \
* The API can be chosen/forced programmatically (as long as no \
  PyQt4/PyQt5/PySide was already imported). \
* An optional compatibility import hook that denies imports from \
  conflicting Qt APIs, or intercepts and fakes Qt4 API imports to use a Qt5 \
  compatible API (some monkey patching is involved)."
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python313-AnyQt-0.2.0-5.5.noarch.rpm"
RPM_HASH = "e1db0859877624037915e0cd18805d7a8a17c4b2ac5f742e8b08205ac5ad02bd441d74f8f883945a0147a088b212755dd4bc3b1549380992c50e21c6a548f043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-AnyQt \
python3.13dist-anyqt \
python313-AnyQt \
python3dist-anyqt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
