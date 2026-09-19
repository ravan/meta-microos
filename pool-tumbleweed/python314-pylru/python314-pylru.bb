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

RPM_NAME = "python314-pylru-1.3.1-1.2.noarch.rpm"
RPM_HASH = "a8a0f056b2d3e57a11586aa8e62b3a9a3074b9b7eaba7e54f4b41cb7b72aff8c37632d0fcbbcee25104dfa36a0bf9253c615b34426e45fad11b1b09ea13fa783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylru \
python314-pylru \
python3dist-pylru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
