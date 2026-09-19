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

RPM_NAME = "python314-AnyQt-0.2.0-5.5.noarch.rpm"
RPM_HASH = "645ffe1797b90cf8a7c63ff17fc4232d0322842443ad113be01bdee25c40fb2d53618a01319281dfcd7cb9eedc84597f70aa7b8b1a4c9630bc55ec89cbd8f46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anyqt \
python314-AnyQt \
python3dist-anyqt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
