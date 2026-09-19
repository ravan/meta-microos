SUMMARY = "The NetBSD version of mkdep(1) tool"
DESCRIPTION = "bmkdep constructs Makefile dependency list. It takes \
a set of flags for the C compiler and a list of C source \
files as arguments and constructs a set of include file dependencies \
which are written into the file '.depend'."
LICENSE = "BSD-2-Clause"

PV = "20140112"

RPM_NAME = "bmkdep-20140112-2.9.aarch64.rpm"
RPM_HASH = "c1eacfbf447835e337106bea35f28cfe92ac354021feada4f8e3b81d006fcacf3b4e509d85db748825f7d88b342d9e297a8c95cd02c38ee2221ea8d09092cd30"

RPROVIDES:${PN} += "bmkdep"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
