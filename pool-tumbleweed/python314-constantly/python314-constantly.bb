SUMMARY = "Symbolic constants in Python"
DESCRIPTION = "A library that provides symbolic constant support. \
It includes collections and constants with text, numeric, and bit flag values. \
Originally ``twisted.python.constants`` from the `Twisted <https://twistedmatrix.com/>`_ project."
LICENSE = "MIT"

PV = "23.10.4"

RPM_NAME = "python314-constantly-23.10.4-1.8.noarch.rpm"
RPM_HASH = "466d98759331af407731d57af7d6d162f5f63b58a941594429a880d801c7ce329d6eda16165a8a3b96b54d3c7d839752bcbc1f448726cc07d50df113d1ec868c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-constantly \
python314-constantly \
python3dist-constantly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
