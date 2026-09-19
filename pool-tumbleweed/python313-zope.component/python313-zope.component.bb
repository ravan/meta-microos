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

RPM_NAME = "python313-zope.component-7.1-1.3.noarch.rpm"
RPM_HASH = "2034d2c48aab918cd7bbd007d406a6ce85e5f19a0ceeced49cccb4863e3e675ea67496beed029a0a447018286157d61a27c484a0e926c11378b6d81687de9253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.component \
python3.13dist-zope.component \
python313-zope.component \
python3dist-zope.component"

RDEPENDS:${PN} += "python-abi \
python313-zope.event \
python313-zope.hookable \
python313-zope.interface"

inherit rpm
