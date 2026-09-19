SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.3"

RPM_NAME = "python313-pylibacl-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "2b3dacf92378063e60c80bdf15e679197627408012df720989bfa7d0c1a4542e9c10baa39a72c8d178a611a6123fd0f7d490d4dbf63bc1be73a5316423d8236c"

RPROVIDES:${PN} += "python3-pylibacl \
python3.13dist-pylibacl \
python313-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
