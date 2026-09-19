SUMMARY = "JSON serialising/deserialising, done correctly and fast"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
See MAPPING, below, on how JSON::XS maps perl values to JSON values and \
vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.40.0"

RPM_NAME = "perl-JSON-XS-4.40.0-1.7.aarch64.rpm"
RPM_HASH = "d580e1346073e86ccba6578469a07e6e1c0db1d000f9097784b85e4380b4065dcd1a4b8a5276d401abff6ca11f59af48df14d95f2c38d4887cf7800b7af2e0b6"

RPROVIDES:${PN} += "perl-JSON--XS \
perl-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Types--Serialiser \
perl-common--sense"

inherit rpm
