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

RPM_NAME = "python313-zope.hookable-8.2-1.4.aarch64.rpm"
RPM_HASH = "e38f26d1de7303043c9f1cbb918ee5225a1b810760c63f0ec68ee81bf5762537e92239213daf3f50038062fab67d1328e321d330d8b6752f0fa0932f45ce96ab"

RPROVIDES:${PN} += "python3-zope.hookable \
python3.13dist-zope.hookable \
python313-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
