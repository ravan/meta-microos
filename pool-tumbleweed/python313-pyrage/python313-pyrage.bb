SUMMARY = "Python bindings for rage (age in Rust)"
DESCRIPTION = "Python bindings for the Rust implementation of age."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python313-pyrage-1.2.3-1.14.aarch64.rpm"
RPM_HASH = "74fcb83b58f624d1e82accfb514dbaf9228602f9724c1fee24b19531361fd572eaffaa4656d9c03a3bd778f34baa8f5fe49367004927de49c359d9c59d78861a"

RPROVIDES:${PN} += "python3-pyrage \
python3.13dist-pyrage \
python313-pyrage \
python3dist-pyrage"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
