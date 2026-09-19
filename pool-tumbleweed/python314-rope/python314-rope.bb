SUMMARY = "A python refactoring library"
DESCRIPTION = "Rope is a python refactoring library. \
 \
* Rope aims to provide powerful and safe refactoring \
* Rope is light on dependency, Rope only depends on Python itself \
* Unlike PyRight or PyLance, Rope does not depend on Node.js \
* Unlike PyLance or PyCharm, Rope is open source. \
* Unlike PyRight and PyLance, Rope is written in Python itself, \
  so if you experience problems, you would be able to debug and \
  hack it yourself in a language that you are already familiar with \
* In comparison to Jedi, Rope is focused on refactoring. While Jedi \
  provides some basic refactoring capabilities, Rope supports many \
  more advanced refactoring operations and options that Jedi does not."
LICENSE = "LGPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "python314-rope-1.14.0-1.4.noarch.rpm"
RPM_HASH = "552d183f31cb196587a71d5d0afe1cc24f971fe5b95edf70de401fdad79b797f61f781662463069f66339f778d6e2aaaae7b4f9dc3d607503ab096cabe2f2efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rope \
python314-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python314 \
python314-pytoolconfig-global"

inherit rpm
