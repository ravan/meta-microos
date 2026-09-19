SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.25.1"

RPM_NAME = "python313-pysmbc-1.0.25.1-2.7.aarch64.rpm"
RPM_HASH = "8c5adaa7375b21f2ea6a264da4bd906451d38d17fe842606b87a4b3fa1dc607e6d9130f139a9b0fa0f37c4d25bb646e806e0d581630618f11838955650006b3e"

RPROVIDES:${PN} += "python-smbc \
python3-pysmbc \
python3-smbc \
python3.13dist-pysmbc \
python313-pysmbc \
python313-smbc \
python3dist-pysmbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
python-abi"

inherit rpm
