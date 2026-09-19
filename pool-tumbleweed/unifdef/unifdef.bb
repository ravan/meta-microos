SUMMARY = "Removes ifdefs from C files"
DESCRIPTION = "Unifdef is useful for removing ifdef'ed lines from a file while otherwise \
leaving the file alone.  Unifdef acts on #ifdef, #ifndef, #else, and #endif \
lines, and it knows only enough about C to know when one of these is \
inactive because it is inside a comment, or a single or double quote."
LICENSE = "BSD-2-Clause"

PV = "2.12"

RPM_NAME = "unifdef-2.12-3.5.aarch64.rpm"
RPM_HASH = "43b5eec22c97e2389cfb38b65fc9749d1e7dea637e6d422e75a1419767bc54e1b47605133b0dcb641323a29b856124b53fed943efab2eb9d37770f7fa1e3aab3"

RPROVIDES:${PN} += "unifdef"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
