SUMMARY = "Write lzma files/buffers"
DESCRIPTION = "This module provides a Perl interface that allows writing lzma compressed \
data to files or buffer. \
 \
For reading lzma files/buffers, see the companion module \
IO::Uncompress::UnLzma."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.217.0"

RPM_NAME = "perl-IO-Compress-Lzma-2.217.0-1.3.noarch.rpm"
RPM_HASH = "2e9008bf9a4a7d8e8b89c1d9dfad5c275d4bd29f3700fd7cef1555f6d4eef7298fa470fe40707116bea812970373a87c64e1406d782714edbd25f4ff34723562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Compress--Adapter--Lzip \
perl-IO--Compress--Adapter--Lzma \
perl-IO--Compress--Adapter--Xz \
perl-IO--Compress--Lzip \
perl-IO--Compress--Lzma \
perl-IO--Compress--Xz \
perl-IO--Uncompress--Adapter--UnLzip \
perl-IO--Uncompress--Adapter--UnLzma \
perl-IO--Uncompress--Adapter--UnXz \
perl-IO--Uncompress--UnLzip \
perl-IO--Uncompress--UnLzma \
perl-IO--Uncompress--UnXz \
perl-IO-Compress-Lzma"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Lzma \
perl-IO--Compress--Base \
perl-IO--Uncompress--Base"

inherit rpm
