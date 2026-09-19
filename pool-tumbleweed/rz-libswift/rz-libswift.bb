SUMMARY = "Swift Demangling library for Rizin"
DESCRIPTION = "Swift demangler for RizinOrg, taken from Apple source code."
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "rz-libswift-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "a1a2f5b46e439093538f8be4805a84f2fe5bec7009aff8b7e012282906c21536fa1374742895dda31be87e1dc19a584a878c32808b6d50fd45f5f437eb4befa8"

RPROVIDES:${PN} += "libswift.so \
rz-libswift"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
rizin"

inherit rpm
