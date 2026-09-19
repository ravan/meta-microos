SUMMARY = "Zope Component Architecture"
DESCRIPTION = "This package is intended to be independently reusable in any Python project. It \
is maintained by the Zope Toolkit project. \
 \
This package represents the core of the Zope Component Architecture. Together \
with the 'zope.interface' package, it provides facilities for defining, \
registering and looking up components. \
 \
Please see http://docs.zope.org/zope.component/ or doc package for the \
documentation."
LICENSE = "ZPL-2.1"

PV = "7.1"

RPM_NAME = "python314-zope.component-7.1-1.3.noarch.rpm"
RPM_HASH = "2fad1f35593d90c115dc51ca1c6e8eda28fcfa5ed0fe3d4047e3ebc5999817637eb5e4538d8e993873058160a3b56e42b69a6d8eb7c16dd230dcdbf0ae25dc0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.component \
python314-zope.component \
python3dist-zope.component"

RDEPENDS:${PN} += "python-abi \
python314-zope.event \
python314-zope.hookable \
python314-zope.interface"

inherit rpm
