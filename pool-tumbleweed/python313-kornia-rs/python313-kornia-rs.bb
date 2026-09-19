SUMMARY = "Low-level computer vision library implemented in Rust"
DESCRIPTION = "Python bindings for kornia-rs, a low-level computer vision library \
written in Rust. It provides image I/O (JPEG via libjpeg-turbo, PNG, \
TIFF, WebP), image processing, AprilTag detection, and 3D vision \
helpers used by python-kornia."
LICENSE = "Apache-2.0"

PV = "0.1.14"

RPM_NAME = "python313-kornia-rs-0.1.14-1.2.aarch64.rpm"
RPM_HASH = "3d2c5e686d94d659fb81278ef06c080d288459f65e01dfc487f443b0cedb96ea2aea0fc6cd7239e8891b71555004c2f8ffcb3d75ac8b8c365b1f10161e4eb520"

RPROVIDES:${PN} += "python3-kornia-rs \
python3.13dist-kornia-rs \
python313-kornia-rs \
python3dist-kornia-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libturbojpeg.so.0 \
python-abi"

inherit rpm
