SUMMARY = "A compact general purpose allocator"
DESCRIPTION = "This is a general purpose allocator. It is a drop-in replacement for \
malloc and can be used in other programs without code changes. \
 \
Performance characteristics in comparison to allocators like tcmalloc 2.7, \
jemalloc 5.2.1 and glibc 2.31 is favorable, with generally 6% or better in \
timing, depending on the particular workload."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "libmimalloc3-3.3.2-1.3.aarch64.rpm"
RPM_HASH = "4150109c118642eb4bbc567c9229e06ba91b1afcbddf2b4628ba7753ccfd5d14c9a62921db5207f2e216bfd43e3269df0c7f8d1d3504bd8e4833358140a4e360"

RPROVIDES:${PN} += "libmimalloc.so.3 \
libmimalloc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
