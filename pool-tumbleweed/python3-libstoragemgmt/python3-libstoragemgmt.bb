SUMMARY = "Python client libraries and plug-in support for libStorageMgmt"
DESCRIPTION = "The python-libstoragemgmt package contains python client libraries as \
well as python framework support and open source plug-ins written in python. \
 \
 \
 \
 \
Provides:       python3-libstoragemgmt < 1.10.3-1.3"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "python3-libstoragemgmt-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "83285d895ae45d06ba917e435628fc70c11ffc457e468a0c9084bb9c48804db0e458422d463a00dbe8aabdf230dc795cbb018d62aa58130b26dfd2351e52a0c9"

RPROVIDES:${PN} += "config-python3-libstoragemgmt \
python3-libstoragemgmt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstoragemgmt \
libstoragemgmt.so.1 \
python-abi"

inherit rpm
