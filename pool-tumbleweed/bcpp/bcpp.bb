SUMMARY = "Beautify C++ programs"
DESCRIPTION = "bcpp indents C/C++ source programs, replacing tabs with spaces or the reverse. \
Unlike indent, it does (by design) not attempt to wrap long statements."
LICENSE = "MIT"

PV = "20250914"

RPM_NAME = "bcpp-20250914-1.4.aarch64.rpm"
RPM_HASH = "06b8863098c29545d4d4057a257ddec711f4172dd6e3e6a9cc4eb29fff157574bacfd06dde68712b7476f33116a5451aed461dbcbf8f0c36db9495a53f408576"

RPROVIDES:${PN} += "bcpp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
