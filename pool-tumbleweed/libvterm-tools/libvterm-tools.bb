SUMMARY = "Tools for libvterm"
DESCRIPTION = "This package contains tools for libvterm."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "libvterm-tools-0.3.3-1.11.aarch64.rpm"
RPM_HASH = "1a1e8d68806aa354fc766eac56fe112b98baa50c18e060ef4856c3c6773b379858fffdaadedab00cf6d8e7f3fef554c25ee7230f5e8803da2d7672eae31a6a6a"

RPROVIDES:${PN} += "libvterm-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvterm.so.0"

inherit rpm
