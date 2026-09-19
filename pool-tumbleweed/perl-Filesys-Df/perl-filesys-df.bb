SUMMARY = "Perl extension for filesystem disk space information"
DESCRIPTION = "This module provides a way to obtain filesystem disk space information. \
This is a Unix only distribution. If you want to gather this information \
for Unix and Windows, use Filesys::DfPortable. The only major benefit of \
using Filesys::Df over Filesys::DfPortable, is that Filesys::Df supports \
the use of open filehandles as arguments. \
 \
Authors: \
    Ian Guthrie <IGuthrie@aol.com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.92"

RPM_NAME = "perl-Filesys-Df-0.92-16.55.aarch64.rpm"
RPM_HASH = "24a155435552143fe7fe446ac9e8132e68bc23f1e7542aa7965c12e2f1db22d086d7fed669aeecbab01d2394f5975620dcccfeea1ae4803d6eafd256d046c8e5"

RPROVIDES:${PN} += "perl-Filesys--Df \
perl-Filesys-Df"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
