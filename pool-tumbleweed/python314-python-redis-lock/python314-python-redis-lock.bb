SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python314-python-redis-lock-4.0.0-1.12.noarch.rpm"
RPM_HASH = "e8882d968c8282a77b7c9c42ccace4f01ad2c270412f173ae26d5e8970e1c33ae14c559f05e42db9bb58c6eceb5b6d19483f93154626bcfd08225916aaaf2f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-redis-lock \
python314-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python314-redis"

inherit rpm
