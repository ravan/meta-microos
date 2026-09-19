SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "ginac-1.8.10-1.4.aarch64.rpm"
RPM_HASH = "023714557f1355c07000c71f5c435c8dc71621506d6349c3a8d93cdb5bbd08b7a668f6ef9f7bf16c0eb23360bed206f2428df82822dd8b230b70c94d993ae68b"

RPROVIDES:${PN} += "ginac"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libginac.so.13 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
