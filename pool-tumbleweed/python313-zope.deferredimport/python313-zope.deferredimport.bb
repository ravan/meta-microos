SUMMARY = "On-demand import name resolver"
DESCRIPTION = "Often, especially for package modules, you want to import names for \
convenience, but not actually perform the imports until necessary. \
The zope.deferredimport package provided facilities for defining names \
in modules that will be imported from somewhere else when used.  You \
can also cause deprecation warnings to be issued when a variable is \
used. \
 \
Documentation is hosted at https://zopedeferredimport.readthedocs.io/"
LICENSE = "ZPL-2.1"

PV = "6.1.1"

RPM_NAME = "python313-zope.deferredimport-6.1.1-2.1.noarch.rpm"
RPM_HASH = "c718cbb187267c41c1de84ccdf7add691ae1f8614dc6b21171a0a3c82edb0d6bec28077080b87f56af3b1fbf73d45b8070a65b592cad7cb037415165b34382dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deferredimport \
python3.13dist-zope.deferredimport \
python313-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python313-zope.proxy"

inherit rpm
