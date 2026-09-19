SUMMARY = "Graph algorithms optimized for version control systems"
DESCRIPTION = "vcsgraph is a high-performance graph algorithms library specifically \
designed for working with version control system (VCS) data \
structures. It provides efficient implementations of common graph \
operations needed by VCS tools, with both pure Python and \
Rust-accelerated implementations for performance-critical operations."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "python313-vcsgraph-0.2.0-1.4.aarch64.rpm"
RPM_HASH = "42b427d9db0ed42b98568bbd68b458deefc4a8882a86174a9332a4df74bcd680148ad0e7b0a0400b2ec752c61587a6933dd875959c185ad521972ac3787a0e3a"

RPROVIDES:${PN} += "python3-vcsgraph \
python3.13dist-vcsgraph \
python313-vcsgraph \
python3dist-vcsgraph"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
