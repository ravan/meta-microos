SUMMARY = "Fuzzy string compare"
DESCRIPTION = "The fstrcmp package provides a library which may be used to make fuzzy \
comparisons of strings and byte arrays.  It also provides simple \
commands for use in shell scripts."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.D001"

RPM_NAME = "fstrcmp-0.7.D001-1.25.aarch64.rpm"
RPM_HASH = "fdf2089abbb521b9c2bdd273638d21e2a19fb808b1f33cf543082ab2361d89e7675224cdb26c00fcd22364bd5550bfbbef7fab888c8e790a6d826a86a7d47e22"

RPROVIDES:${PN} += "fstrcmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfstrcmp.so.0"

inherit rpm
