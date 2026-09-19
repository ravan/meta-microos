SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.9"

RPM_NAME = "python314-fuse-1.0.9-1.7.aarch64.rpm"
RPM_HASH = "c1ad7b9af4e8758c4ea4685bd6effca6f9d55d4b5c5ed27d51570db3b7d6aa9f3cdf867eb89ad7d382a41e261334de27920e2757ae44c925308dc8b030951679"

RPROVIDES:${PN} += "python3.14dist-fuse-python \
python314-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
