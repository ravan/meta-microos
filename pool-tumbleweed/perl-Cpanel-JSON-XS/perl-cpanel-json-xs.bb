SUMMARY = "CPanel fork of JSON::XS, fast and correct serializing"
DESCRIPTION = "This module converts Perl data structures to JSON and vice versa. Its \
primary goal is to be _correct_ and its secondary goal is to be _fast_. To \
reach the latter goal it was written in C. \
 \
As this is the n-th-something JSON module on CPAN, what was the reason to \
write yet another JSON module? While it seems there are many JSON modules, \
none of them correctly handle all corner cases, and in most cases their \
maintainers are unresponsive, gone missing, or not listening to bug reports \
for other reasons. \
 \
See below for the cPanel fork. \
 \
See MAPPING, below, on how Cpanel::JSON::XS maps perl values to JSON values \
and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.440.0"

RPM_NAME = "perl-Cpanel-JSON-XS-4.440.0-1.1.aarch64.rpm"
RPM_HASH = "76d740809d39db49dfd2c57b994f8a1b40333d91505859693e4a96f442155d2a49cc03cce99edd162be310bff969a272a09f6b91fe236b1d518ecb7e4d79647e"

RPROVIDES:${PN} += "perl-Cpanel--JSON--XS \
perl-Cpanel--JSON--XS--Type \
perl-Cpanel-JSON-XS"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
