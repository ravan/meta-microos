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

RPM_NAME = "python313-rope-1.14.0-1.4.noarch.rpm"
RPM_HASH = "d8d02c6aef1ece6664f2057acd41956f8b176a5e7943f2f510e6f930a3cda721bcd5b987cdd664241dc121e7470d7f4f798cfe7c329c2cc7fe522115127929fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rope \
python3.13dist-rope \
python313-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python313 \
python313-pytoolconfig-global"

inherit rpm
