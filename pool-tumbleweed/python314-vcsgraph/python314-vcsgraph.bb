SUMMARY = "Graph algorithms optimized for version control systems"
DESCRIPTION = "vcsgraph is a high-performance graph algorithms library specifically \
designed for working with version control system (VCS) data \
structures. It provides efficient implementations of common graph \
operations needed by VCS tools, with both pure Python and \
Rust-accelerated implementations for performance-critical operations."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "python314-vcsgraph-0.2.0-1.4.aarch64.rpm"
RPM_HASH = "800f8590392892943fc7e76d86fe3e841f1e596d50302782a271f020a2dcc395a6a25a6c23a2f056ec2927d05307192c21e66ea370cf5f62368c413045f3fea2"

RPROVIDES:${PN} += "python3.14dist-vcsgraph \
python314-vcsgraph \
python3dist-vcsgraph"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
