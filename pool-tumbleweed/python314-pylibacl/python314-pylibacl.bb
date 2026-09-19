SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.3"

RPM_NAME = "python314-pylibacl-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "cfeecf07510f403d73e35bf655b6a3bd65b253681ded7e3a6c30422fe99719b8b7ac2b9fa9d25edefb82b1612633eec31c3d2818c0a0c5eeba753382da9406ba"

RPROVIDES:${PN} += "python3.14dist-pylibacl \
python314-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
