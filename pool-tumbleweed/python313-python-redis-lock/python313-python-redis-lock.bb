SUMMARY = "Lock context manager implemented via redis SETNX/BLPOP"
DESCRIPTION = "Lock context manager implemented via redis SETNX/BLPOP."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python313-python-redis-lock-4.0.0-1.12.noarch.rpm"
RPM_HASH = "4858db18065f33ac76f89090f689792a5e56e52a2c66a7798b426ab7f19f34e96cf9cdf691294d774d54d1931852abda635467a7336122802bb58a1cb7ac7eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redis-lock \
python3.13dist-python-redis-lock \
python313-python-redis-lock \
python3dist-python-redis-lock"

RDEPENDS:${PN} += "python-abi \
python313-redis"

inherit rpm
