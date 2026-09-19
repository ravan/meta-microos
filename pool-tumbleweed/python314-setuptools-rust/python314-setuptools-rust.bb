SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python314-setuptools-rust-1.13.0-1.3.noarch.rpm"
RPM_HASH = "c00fa149c7d9a22ef74c38d3f2891657063167d6175b3d8e82e73ed5cfe7f6d14fbc9401f0d0b5749665ad8d463cf2af67fae9b77750e6fd1aa516f1ae6d40a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-rust \
python314-setuptools-rust \
python3dist-setuptools-rust"

RDEPENDS:${PN} += "cargo \
python-abi \
python314-semantic-version \
python314-setuptools \
rust"

inherit rpm
