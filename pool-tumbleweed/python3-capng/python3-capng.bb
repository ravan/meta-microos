SUMMARY = "Python bindings for libcap-ng library"
DESCRIPTION = "The libcap-ng-python package contains the bindings so that libcap-ng \
and can be used by Python applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "python3-capng-0.8.5-1.11.aarch64.rpm"
RPM_HASH = "8c0144548d42e4ee390e47f6b3cba395eb8f01b6714e3d8649f24c282e7e723343bd1cd2c4840e24d08afb10177d99756538f068a6ac8ea0f4c426c516f20972"

RPROVIDES:${PN} += "python3-capng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcap-ng0 \
python-abi"

inherit rpm
