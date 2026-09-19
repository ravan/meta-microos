SUMMARY = "A tiny LRU cache implementation and decorator"
DESCRIPTION = "repoze.lru is a LRU (least recently used) cache implementation.  Keys and \
values that are not used frequently will be evicted from the cache faster \
than keys and values that are used frequently.  It works under Python 2.5, \
Python 2.6, Python 2.7, and Python 3.2."
LICENSE = "SUSE-Repoze"

PV = "0.8"

RPM_NAME = "python314-repoze.lru-0.8-1.1.noarch.rpm"
RPM_HASH = "f758a4c862267c5d612c49bf227ec9330ea4ca471d8dd27277f7db08c7b579545d9d7911ee3a5792575f1772d33a0cc30d2abdb5e8ee3399c597d4fa53ddb87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-repoze-lru \
python314-repoze.lru \
python3dist-repoze-lru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
