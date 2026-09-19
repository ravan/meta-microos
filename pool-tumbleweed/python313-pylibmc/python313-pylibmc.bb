SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python313-pylibmc-1.6.3-3.7.aarch64.rpm"
RPM_HASH = "a831e47851b2f64c8fed771439289e0ae43a16066d6c4d8513d072ee91e9f4655e3cb61678aafc9168f0479316954d83b993a447565884f4bc09f457c93f7513"

RPROVIDES:${PN} += "python3-pylibmc \
python3.13dist-pylibmc \
python313-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
