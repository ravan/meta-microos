SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "6.8"

RPM_NAME = "python313-persistent-6.8-1.1.aarch64.rpm"
RPM_HASH = "8f8d58e8a33ecdf29c0c35ece6545006e057f9b600834ab18f97199e5447753db306423c8fe9ef3b3d9591221302fef11f72b19590f2f0777042617dd38caa6a"

RPROVIDES:${PN} += "python3-persistent \
python3.13dist-persistent \
python313-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cffi \
python313-zope.deferredimport \
python313-zope.interface"

inherit rpm
