SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.8"

RPM_NAME = "python313-repoze.lru-0.8-1.1.noarch.rpm"
RPM_HASH = "0300b1ef18b9710670ae4875f66f47cbfb37e64d0fd7cb2f38dfd682a4243c7bde97c3d20561860d7373fb93076a1278496f6a068e46f7a702468082fbaef574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-repoze.lru \
python3.13dist-repoze-lru \
python313-repoze.lru \
python3dist-repoze-lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
