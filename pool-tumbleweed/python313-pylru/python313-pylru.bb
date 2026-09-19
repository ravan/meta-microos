SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache \
is efficient and written in pure Python. It works with Python 2.6+ including \
the 3.x series. Basic operations (lookup, insert, delete) all run in a constant \
amount of time. Pylru provides a cache class with a simple dict interface. It \
also provides classes to wrap any object that has a dict interface with a \
cache. Both write-through and write-back semantics are supported. Pylru also \
provides classes to wrap functions in a similar way, including a function \
decorator."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-pylru-1.3.1-1.2.noarch.rpm"
RPM_HASH = "28098d464c93f066f881982c6454f782837e4fcb58fc9ed685772797efd48939c4e942684a3210a21c76dd5d135455630fd8b6b08bc1e173422ce88391e80a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylru \
python3.13dist-pylru \
python313-pylru \
python3dist-pylru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
