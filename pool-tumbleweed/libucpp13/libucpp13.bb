SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver Library"
DESCRIPTION = "ucpp is a preprocessor for C source code, specifically code compliant to the \
ISO standard 9899:1999, also known as C99. A preprocessor is responsible for \
macro replacement, conditional compilation and inclusion of header files. \
 \
ucpp, built as a library, outputs tokens, one at a time, on demand, \
as an integrated lexer."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libucpp13-1.3.5-2.29.aarch64.rpm"
RPM_HASH = "b1d8aa3af002a829c9575d6e7660eeb8356a68b39ee89ca9c35b5054c701e07cb3e95c2a8e020b09e20b9abe74b6a3d9418bbbf3326dfecd5e33039420562859"

RPROVIDES:${PN} += "libucpp.so.13 \
libucpp13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
