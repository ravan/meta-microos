SUMMARY = "Non-blocking system DNS resolver"
DESCRIPTION = "This class provides several methods for host name resolution. It is \
designed to be used with event loops. All resolving are done by \
getaddrinfo(3) implemented in your system library. Since getaddrinfo() is \
blocking function and we don't want to block, calls to this function will \
be done in separate thread. This class uses system native threads and not \
perl threads. So overhead shouldn't be too big."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.220.0"

RPM_NAME = "perl-Net-DNS-Native-0.220.0-2.14.aarch64.rpm"
RPM_HASH = "d00d3761fe32175c928036091f6c931d4be606b3aba0df9fb4cd386ad988e40d857ee84ca44f8051ca81089d93430b7e835f6080b25db05c2ad84fb38d02e656"

RPROVIDES:${PN} += "perl-Net--DNS--Native \
perl-Net--DNS--Native--Handle \
perl-Net-DNS-Native"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Socket"

inherit rpm
