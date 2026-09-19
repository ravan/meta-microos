SUMMARY = "Mapping table between 8-bit chars and Unicode"
DESCRIPTION = "The Unicode::Map8 class implements efficient mapping tables between \
8-bit character sets and 16-bit character sets like Unicode. The tables \
are efficient both in terms of space allocated and translation speed. \
The 16-bit strings are assumed to use network byte order."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.13"

RPM_NAME = "perl-Unicode-Map8-0.13-25.14.aarch64.rpm"
RPM_HASH = "69ab72f1c706bec455ca85ef525f9bd891e3d9bfcf963634d847060d0b3062c23bd121e0d9614778e28c21c6759708203db413b59e23294ad8a3f68f90066b85"

RPROVIDES:${PN} += "perl-Unicode--Map8 \
perl-Unicode-Map8"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Unicode--String"

inherit rpm
