SUMMARY = "Recursively copy Perl datatypes"
DESCRIPTION = "This module provides a 'clone()' method which makes recursive copies of \
nested hash, array, scalar and reference types, including tied variables \
and objects. \
 \
'clone()' takes a scalar argument and duplicates it. To duplicate lists, \
arrays or hashes, pass them in by reference, e.g. \
 \
    my $copy = clone (\\@array); \
 \
     \
 \
    my %copy = %{ clone (\\%hash) };"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.500.0"

RPM_NAME = "perl-Clone-0.500.0-1.5.aarch64.rpm"
RPM_HASH = "353b9cbd54096474fbdc9decadfed99800a3fa8eed5fe480e9b0cd112bab9d72cb953d559f4c7494a089867ca3fda12db8f85d2ea628b0cf7abc3673eae3fa36"

RPROVIDES:${PN} += "perl-Clone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
