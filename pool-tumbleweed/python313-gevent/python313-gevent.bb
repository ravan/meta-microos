SUMMARY = "Python network library that uses greenlet and libevent"
DESCRIPTION = "Gevent is a Python networking library that uses greenlet to provide synchronous \
API on top of a libevent event loop. Features include: \
 \
  * Fast event loop based on libevent. \
  * Lightweight execution units based on greenlet. \
  * Familiar API that re-uses concepts from the Python standard library. \
  * Cooperative sockets with ssl support. \
  * DNS queries performed through libevent-dns. \
  * Ability to use standard library and 3rd party modules written for standard \
    blocking sockets \
  * Fast WSGI server based on libevent-http. \
 \
gevent is inspired by eventlet but features more consistent API, simpler \
implementation and better performance. Read why others use gevent and check \
out the list of the open source projects based on gevent."
LICENSE = "MIT"

PV = "26.8.0"

RPM_NAME = "python313-gevent-26.8.0-1.1.aarch64.rpm"
RPM_HASH = "20b16dfb5df4b2590e64dc4221d87e5f37b62cd0c220b9eb69314a6c5735d365755b95fb165f90c23d96dc1298789dde40bd89f0b0e20b735d474af2524ebb96"

RPROVIDES:${PN} += "python3-gevent \
python3.13dist-gevent \
python313-gevent \
python3dist-gevent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
python-abi \
python313-greenlet \
python313-zope.event \
python313-zope.interface"

inherit rpm
