SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.25.1"

RPM_NAME = "python314-pysmbc-1.0.25.1-2.7.aarch64.rpm"
RPM_HASH = "f8102d29fe53367d961e625a5eadddd991005189dffe630f09c8ab5fbd1e50c1d4503c94d8642f763ec01c9b8546d0e34505e5f8e3819a85b4240e7add0712cf"

RPROVIDES:${PN} += "python-smbc \
python3.14dist-pysmbc \
python314-pysmbc \
python314-smbc \
python3dist-pysmbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
python-abi"

inherit rpm
