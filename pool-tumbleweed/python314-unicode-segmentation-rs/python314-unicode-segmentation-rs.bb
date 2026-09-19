SUMMARY = "Unicode segmentation and width for Python using Rust"
DESCRIPTION = "Python bindings for the Rust \
[unicode-segmentation](https://docs.rs/unicode-segmentation/) and \
[unicode-width](https://docs.rs/unicode-width/) crates, providing Unicode text \
segmentation and width calculation according to Unicode standards."
LICENSE = "CC0-1.0 & MIT"

PV = "0.2.4"

RPM_NAME = "python314-unicode-segmentation-rs-0.2.4-1.5.aarch64.rpm"
RPM_HASH = "10d552cb8528c48093d4059463fd4db7504f3973832fa660ceefa26fb38702ee067ad3afef49aeebce0b331b5c47ed55d4b716c5fc26852deed69acb74bf266d"

RPROVIDES:${PN} += "python3.14dist-unicode-segmentation-rs \
python314-unicode-segmentation-rs \
python3dist-unicode-segmentation-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
