SUMMARY = "Parse Python docstrings in reST, Google and Numpydoc format"
DESCRIPTION = "Parse Python docstrings. Currently support ReST, Google, Numpydoc-style and \
Epydoc docstrings."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python314-docstring-parser-0.18.0-1.3.noarch.rpm"
RPM_HASH = "ca9f7acdcea8cea90ffa766d7d0ecf48c88cf39ff26e2d11ed83c9b0c1e334f2826f730bcaa24216621b75ce79b9fe52071b164000856b2329a28e36996a007c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docstring-parser \
python314-docstring-parser \
python3dist-docstring-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
