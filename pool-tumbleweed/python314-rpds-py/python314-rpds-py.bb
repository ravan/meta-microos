SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "2026.6.3"

RPM_NAME = "python314-rpds-py-2026.6.3-1.3.aarch64.rpm"
RPM_HASH = "5264ea6eb220bca442fca034450826aa7e7eb81dbd284c8adb8175534862c5853a4eb0f30b6bb74348c3b86363b317effa0e33e2cfc80b6de7ac264314fd00a8"

RPROVIDES:${PN} += "python3.14dist-rpds-py \
python314-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-maturin"

inherit rpm
