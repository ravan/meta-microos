SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "2026.6.3"

RPM_NAME = "python313-rpds-py-2026.6.3-1.3.aarch64.rpm"
RPM_HASH = "0471313633c816bb7ba7bba142c77e7550063e73bca3e250ae80b584e6800760e68d28e676daab839cffaa3b839d4d54655bbf3ac25a9a0946993d16e0124bb7"

RPROVIDES:${PN} += "python3-rpds-py \
python3.13dist-rpds-py \
python313-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-maturin"

inherit rpm
