SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.9"

RPM_NAME = "python313-fuse-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "5c77057412fa061ad2a387d78a197f60ec782895683befaf5be6244af765f8f893f40d57b871e61b68c24833e172a5614110942f5964dd811955d3b2c5ca008a"

RPROVIDES:${PN} += "python3-fuse \
python3.13dist-fuse-python \
python313-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
