SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "7.3"

RPM_NAME = "python314-zope.proxy-7.3-1.1.aarch64.rpm"
RPM_HASH = "2dde7599bb5c56d66c54abd4123ce5752175c4f4f176caab54b8c72e71c4b7086d1a7523c6ce15188407f17e57ee79c659dbc2491d7bf9b53c8c9b1e9b8c986d"

RPROVIDES:${PN} += "python3.14dist-zope.proxy \
python314-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-zope.interface"

inherit rpm
