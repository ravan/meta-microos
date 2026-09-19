SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python313-redis-7.0.1-2.5.noarch.rpm"
RPM_HASH = "2f8179ecc5819eba3914a5f1fab88a969ac1113647f3d5d0e3efad1b002bcaa6e2971925f076f0d34ddcebb18f0b0862674c6b666c35bbd79f8d78e4c80550d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-redis \
python3.13dist-redis \
python313-redis \
python3dist-redis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
