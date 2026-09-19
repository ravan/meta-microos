SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260704"

RPM_NAME = "python314-libesedb-20260704-1.2.aarch64.rpm"
RPM_HASH = "8c0b6e4b675603b581ff96be8a49de565fc9fbd7026210570aca35193962bec7a4a4c81e2cf45d17bc465f2d8f9e27e5994996409e45bb466ff3f7dbba2820e6"

RPROVIDES:${PN} += "python314-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
