SUMMARY = "Tools for libunicode"
DESCRIPTION = "The libunicode-tools package contains tools about libunicode."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "libunicode-tools-0.6.0-1.7.aarch64.rpm"
RPM_HASH = "e17419ade07f00be8259e43d5b0394e817600f65fc94d3870f0ab5f986d4f9ea52f4b41f1a44fa374a8a9998150d79d35a5ecf507ab3b76afd794005a2bcb6d3"

RPROVIDES:${PN} += "libunicode-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunicode-ucd.so.0.6 \
libunicode.so.0.6 \
libunicode0-6"

inherit rpm
