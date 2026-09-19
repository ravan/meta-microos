SUMMARY = "Python client for Redis key-value store"
DESCRIPTION = "The Python interface to the Redis key-value store."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python314-redis-7.0.1-2.5.noarch.rpm"
RPM_HASH = "36616e6b631ed5d0bc3cefc85f538bf84e66a3a1882b7fd76a0eda215f5436931955a02f4dcdeb197cd682b3fd68319b3e60b206ea29197231ad897a4b20517b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-redis \
python314-redis \
python3dist-redis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
