SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.12"

RPM_NAME = "python313-cwcwidth-0.1.12-1.6.aarch64.rpm"
RPM_HASH = "9c4b797f26be7e2453cc35c796696bf36ec377cb446b1af90ae9e333b0864f5bbc34fdb3c8a2db3d941f39822e45a8f62051d08d3e34366ca73e2403b1e7021a"

RPROVIDES:${PN} += "python3-cwcwidth \
python3.13dist-cwcwidth \
python313-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
