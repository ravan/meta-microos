SUMMARY = "Print lines matching a pattern"
DESCRIPTION = "The grep command searches one or more input files for lines containing a \
match to a specified pattern.  By default, grep prints the matching lines."
LICENSE = "GPL-3.0-or-later"

PV = "3.12"

RPM_NAME = "grep-3.12-1.5.aarch64.rpm"
RPM_HASH = "d475bca88f378b6912763c7cf41106c88bd6ed291183df1a3894477a1d7f867bc805484c0e7f04528f4c50cc44f55cfb25cc4a6c2e0a6c7fd99002eb94a96f1d"

RPROVIDES:${PN} += "/usr/bin/grep \
base-/usr/bin/grep \
grep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
