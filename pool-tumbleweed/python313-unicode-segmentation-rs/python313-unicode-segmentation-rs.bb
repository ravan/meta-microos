SUMMARY = "Unicode segmentation and width for Python using Rust"
DESCRIPTION = "Python bindings for the Rust \
[unicode-segmentation](https://docs.rs/unicode-segmentation/) and \
[unicode-width](https://docs.rs/unicode-width/) crates, providing Unicode text \
segmentation and width calculation according to Unicode standards."
LICENSE = "CC0-1.0 & MIT"

PV = "0.2.4"

RPM_NAME = "python313-unicode-segmentation-rs-0.2.4-1.5.aarch64.rpm"
RPM_HASH = "db9f2d04e4c2fe8282ff86e72a8cc34609f07ee2d5412733f3213c165d5339c5efc3af1cc70200f0940b51a79a12f113012b3d770373331fe66c7d762c2c493c"

RPROVIDES:${PN} += "python3-unicode-segmentation-rs \
python3.13dist-unicode-segmentation-rs \
python313-unicode-segmentation-rs \
python3dist-unicode-segmentation-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
