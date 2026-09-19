SUMMARY = "XBase Compatible C++ Class Library"
DESCRIPTION = "This package contains various utilities for working with X-Base files: \
checkndx (check an NDX file), copydbf (copy a DBF file structure), deletall \
(mark all records for deletion), dumphdr (print an X-Base file header), \
dumprecs (dump records for an X-Base file), packdbf (pack a database file), \
reindex (rebuild an index), undelall (undeletes all deleted records in a file), \
xbase-zap (remove all records from a DBF file)."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-3.1.2-1.36.aarch64.rpm"
RPM_HASH = "9a6c3354aa3ef98863e16cf89299342242dbaee7a8b6eaa5d1a246543ba411cc36d529c2692b326c5007366668327f6ea9c6a6279b83da2cd4ce11d3cc536510"

RPROVIDES:${PN} += "xbase \
xbase64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxbase64.so.1"

inherit rpm
