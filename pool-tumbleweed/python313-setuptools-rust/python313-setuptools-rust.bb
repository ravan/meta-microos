SUMMARY = "Setuptools plugin for Rust extensions"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust Python extensions \
implemented with PyO3 or rust-cpython. \
 \
Compile and distribute Python extensions written in Rust as easily as if they \
were written in C."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python313-setuptools-rust-1.13.0-1.3.noarch.rpm"
RPM_HASH = "b98ae3dcf970e5894f19d864629f899431376e3d8915676d8dec7f49c3c4f9ef35185f964f1f670f0964675d113ed1cb6342e7e2d2165cefb5ea1805c6979eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-rust \
python3.13dist-setuptools-rust \
python313-setuptools-rust \
python3dist-setuptools-rust"

RDEPENDS:${PN} += "cargo \
python-abi \
python313-semantic-version \
python313-setuptools \
rust"

inherit rpm
