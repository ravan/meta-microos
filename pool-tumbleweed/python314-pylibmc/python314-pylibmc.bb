SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python314-pylibmc-1.6.3-3.7.aarch64.rpm"
RPM_HASH = "40ff33e68ab53ca1b36dfc30c283858d8dc5ce7ce7fa73b353766a2d68a73ee954534ab019dcf638e6ab43d8420aef24acafa502fc21147af8bc49ce0c563d80"

RPROVIDES:${PN} += "python3.14dist-pylibmc \
python314-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
