SUMMARY = "Python bindings for libstorage-ng"
DESCRIPTION = "This package contains Python bindings for libstorage-ng."
LICENSE = "GPL-2.0-only"

PV = "4.5.352"

RPM_NAME = "libstorage-ng-python3-4.5.352-1.1.aarch64.rpm"
RPM_HASH = "bbed3254e7cda16ed6a26b16b63126ed78eb58bd0a608748b9bb4aaa94dd22cfc6d47c04b00066ed3f096898aad98ac4d3c6021e4615452494557992d5f5dafa"

RPROVIDES:${PN} += "libstorage-ng-python-3.13 \
libstorage-ng-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libstorage-ng.so.1 \
libstorage-ng1 \
python-abi"

inherit rpm
