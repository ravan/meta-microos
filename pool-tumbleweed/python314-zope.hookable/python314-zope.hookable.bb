SUMMARY = "Zope hookable"
DESCRIPTION = "Hookable object support. \
 \
Support the efficient creation of hookable objects, which are callable objects \
that are meant to be replaced by other callables, at least optionally. \
 \
The idea is you create a function that does some default thing and make it \
hookable. Later, someone can modify what it does by calling its sethook method \
and changing its implementation. All users of the function, including those \
that imported it, will see the change."
LICENSE = "ZPL-2.1"

PV = "8.2"

RPM_NAME = "python314-zope.hookable-8.2-1.4.aarch64.rpm"
RPM_HASH = "2c5bade6f9c23c1552ea224b68ccc349ab543922ecb728b8d217be71c3d716d691426b8ad9b0e9fa86850b3123ca7d711b31c69465d792c7973b61e9022f32cb"

RPROVIDES:${PN} += "python3.14dist-zope.hookable \
python314-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
