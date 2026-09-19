SUMMARY = "Perl extension for getting CPU information. Currently only number of CPU[cut]"
DESCRIPTION = "In responce to a post on perlmonks.org, a module for counting the number of \
CPU's on a system. Support has now also been added for type of CPU and \
clock speed. While much of the code is from UNIX::Processors, win32 support \
has been added (but not tested)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-Sys-CPU-0.61-6.14.aarch64.rpm"
RPM_HASH = "b179545af59579eafeed8187c538eb29f3793862e36ed495d0e0d48903d373584baef03d858fc21c340aad7f14c5df405199127d5fea5b698e06fb14327143ac"

RPROVIDES:${PN} += "perl-Sys--CPU \
perl-Sys-CPU"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
