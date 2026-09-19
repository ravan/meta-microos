SUMMARY = "Translucent persistent objects"
DESCRIPTION = "This package contains a generic persistence implementation for Python. It forms \
the core protocol for making objects interact 'transparently' with a database \
such as the ZODB."
LICENSE = "ZPL-2.1"

PV = "6.8"

RPM_NAME = "python314-persistent-6.8-1.1.aarch64.rpm"
RPM_HASH = "bbb0184804e34dd4307a5572c5ce1fc49a56dccff002922f9ff7f94e2be3141b4136f3bbb7d0a57201864c6746c21ea6eb98aa04063a891ed62fb7a3611172ec"

RPROVIDES:${PN} += "python3.14dist-persistent \
python314-persistent \
python3dist-persistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cffi \
python314-zope.deferredimport \
python314-zope.interface"

inherit rpm
