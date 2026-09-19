SUMMARY = "Perl extension for access to network card configuration information"
DESCRIPTION = "IO::Interface adds methods to IO::Socket objects that allows them to be \
used to retrieve and change information about the network interfaces on \
your system. In addition to the object-oriented access methods, you can use \
a function-oriented style. \
 \
THIS API IS DEPRECATED. Please see IO::Interface::Simple for the preferred \
way to get and set interface configuration information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-IO-Interface-1.09-2.54.aarch64.rpm"
RPM_HASH = "0a3366e5bd3dc9f9f1d26538537571136b6468945630c28a1b29fa8d203701d5cb9622ba358fd3884adb6184e4b751bbfe54c31d71fe8762bdde13c8866459a2"

RPROVIDES:${PN} += "perl-IO--Interface \
perl-IO--Interface--Simple \
perl-IO-Interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
