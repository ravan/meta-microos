SUMMARY = "Library and tools to access the ESE Database File (EDB) format"
DESCRIPTION = "Library and tools to access the Extensible Storage Engine (ESE) Database File \
(EDB) format. ESEDB is used in may different applications like Windows Search, \
Windows Mail, Exchange, Active Directory, etc."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260704"

RPM_NAME = "python313-libesedb-20260704-1.2.aarch64.rpm"
RPM_HASH = "76b2262a06d82e0a946496a8ebd9cb2f642cb051f434eb5c7d8fcbe4394a0cb3376855507f1df71415bcd5794a0ed460355cd15738fa80a0e857dddb357fa684"

RPROVIDES:${PN} += "python3-libesedb \
python313-libesedb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libesedb.so.1 \
python-abi"

inherit rpm
