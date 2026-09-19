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

RPM_NAME = "python314-zope.deferredimport-6.1.1-2.1.noarch.rpm"
RPM_HASH = "341ccb86afc786ab9b3986a1ac2dec1c39f7e8aa3e4c6ce5312fbcbff4f2d3350643875e606cc6a3c179d2ad6605991fc54b24dd9f294f182cbf97421cd58a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.deferredimport \
python314-zope.deferredimport \
python3dist-zope.deferredimport"

RDEPENDS:${PN} += "python-abi \
python314-zope.proxy"

inherit rpm
