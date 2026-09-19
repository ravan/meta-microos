SUMMARY = "Python3 bindings for SSSD Murmur hash function"
DESCRIPTION = "This subpackage provides the python3 module for calculating the \
Murmur hash version 3."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "python3-sss-murmur-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "258eaa51fa5ae167bf8d33cc36fd4b5d302a9660bfa0f48de0e5aef831214ddbe4eca52dff7a853f5317d6261283512a65a7c78bbe870dd147e20564e098658e"

RPROVIDES:${PN} += "python3-sss-murmur"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
