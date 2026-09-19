SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "7.3"

RPM_NAME = "python313-zope.proxy-7.3-1.1.aarch64.rpm"
RPM_HASH = "c33c3691bb3480082cb59b566908644f38f6d9f548e488252c6686cc9fdd1307fe9dd608779051e968352e7670ecb084a8bda45f2b3624a2380d301a122db4d7"

RPROVIDES:${PN} += "python3-zope.proxy \
python3.13dist-zope.proxy \
python313-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-zope.interface"

inherit rpm
