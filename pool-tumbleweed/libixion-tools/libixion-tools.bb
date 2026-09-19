SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to use ixion parser and interpreter from cli."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "libixion-tools-0.20.0-4.7.aarch64.rpm"
RPM_HASH = "952998c1fca2e56ab083d3aafc0dd5cc20a5aa37c0e0664d95dd4ca043d3aaed5c8f84f9452505a5b009588ee93bb294d887d8b9a44095a6f35f3405b7034618"

RPROVIDES:${PN} += "libixion-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0-20-0 \
libixion-0.20.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
