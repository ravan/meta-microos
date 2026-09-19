SUMMARY = "Rust bits for mitmproxy"
DESCRIPTION = "This package contains mitmproxy's Rust bits."
LICENSE = "MIT"

PV = "0.12.9"

RPM_NAME = "python314-mitmproxy-rs-0.12.9-1.8.aarch64.rpm"
RPM_HASH = "535a9c3b60acb90e7ee8d791ab2d1449653a2d85c6233a08bc4485e7bd198ab2a775940963e37632a6f6ad8dbfa816eacb6a1c8819667a89f22c3bca4027d52a"

RPROVIDES:${PN} += "python3.14dist-mitmproxy-rs \
python314-mitmproxy-rs \
python3dist-mitmproxy-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
