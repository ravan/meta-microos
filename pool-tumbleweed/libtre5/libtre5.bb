SUMMARY = "POSIX-compatible regexp library with approximate matching"
DESCRIPTION = "TRE is a POSIX-compatible regexp matching library with approximate \
(fuzzy) matching. TRE's algorithm has linear worst-case time in the \
length of the text being searched, and quadratic worst-case time in \
the length of the used regular expression."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "libtre5-0.9.0-1.8.aarch64.rpm"
RPM_HASH = "7aa981346777319eb1b4eacc4c6b2b14ec549fbf7ad6a6e9c7961e9e8349a7b727d3a27309c65dd7d5d6dc1b939463bde0d09001d51068ce64f5788016e039f9"

RPROVIDES:${PN} += "libtre.so.5 \
libtre5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
