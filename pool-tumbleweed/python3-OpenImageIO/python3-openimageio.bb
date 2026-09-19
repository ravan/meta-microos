SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "Apache-2.0"

PV = "3.1.17.0"

RPM_NAME = "python3-OpenImageIO-3.1.17.0-1.1.aarch64.rpm"
RPM_HASH = "6244122f4c1a6aa1dc01363edfc9d5ba0e793727bdfd9e6074b1e8cf7e65aa3493d0560cfd09dbae37765b31da10ebf8d2e1605bea4cd3abc70c92bfc5031b40"

RPROVIDES:${PN} += "python3-OpenImageIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenImageIO-Util.so.3.1 \
libOpenImageIO.so.3.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
