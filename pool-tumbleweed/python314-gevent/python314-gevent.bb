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

RPM_NAME = "python314-gevent-26.8.0-1.1.aarch64.rpm"
RPM_HASH = "ab460031f06fdc762099c0799a51ea9fc01747646ac200970ad6847e902163d9e36d3a2364fd1086962ecd7d5f1e8f86d34a34804362f5ddde72a2dbacddecaa"

RPROVIDES:${PN} += "python3.14dist-gevent \
python314-gevent \
python3dist-gevent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
python-abi \
python314-greenlet \
python314-zope.event \
python314-zope.interface"

inherit rpm
