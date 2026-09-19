SUMMARY = "Linux kernel block layer testing framework"
DESCRIPTION = "blktests is a test framework for the Linux kernel block layer and \
storage stack. It is inspired by the xfstests filesystem testing \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "0+20260724.6f5a1dc"

RPM_NAME = "blktests-0+20260724.6f5a1dc-1.1.aarch64.rpm"
RPM_HASH = "53ae47102b2a587a46e8aa5964eb6578a5649a221a799f06c895a0b6b7dfbf73d03ec9d321a2b76e1a3ffffc7d5b4f8e97aba5d8a675bd803f481d4e9b9f3396"

RPROVIDES:${PN} += "blktests"

RDEPENDS:${PN} += "/usr/bin/bash \
fio \
gawk \
gcc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liburing.so.2 \
make"

inherit rpm
