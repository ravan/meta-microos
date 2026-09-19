SUMMARY = "Low-level computer vision library implemented in Rust"
DESCRIPTION = "Python bindings for kornia-rs, a low-level computer vision library \
written in Rust. It provides image I/O (JPEG via libjpeg-turbo, PNG, \
TIFF, WebP), image processing, AprilTag detection, and 3D vision \
helpers used by python-kornia."
LICENSE = "Apache-2.0"

PV = "0.1.14"

RPM_NAME = "python314-kornia-rs-0.1.14-1.2.aarch64.rpm"
RPM_HASH = "9027b05454319152af9bd9a029858bade212f785279eecced3eb03bed81f59ee68c0fd57c172dfa37b2b955bf03b9cff7d3b93e10b711caf08dbde84d85cb361"

RPROVIDES:${PN} += "python3.14dist-kornia-rs \
python314-kornia-rs \
python3dist-kornia-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libturbojpeg.so.0 \
python-abi"

inherit rpm
