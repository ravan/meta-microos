SUMMARY = "Perl Module to interpolate Script Options from Files into @ARGV"
DESCRIPTION = "This module simply interpolates option file hints in @ARGV by the contents of \
the pointed files. This enables option reading from files instead of or \
additional to the usual reading from the command line. \
 \
Alternatively, you can process any array instead of @ARGV which is used by \
default and mentioned mostly in this manual. \
 \
The interpolated @ARGV could be subsequently processed by the usual option \
handling, e.g. by a Getopt::xxx module. Getopt::ArgvFile does not perform any \
option handling itself, it only prepares the array @ARGV."
LICENSE = "Artistic-1.0 | Artistic-2.0"

PV = "1.11"

RPM_NAME = "perl-Getopt-ArgvFile-1.11-10.7.aarch64.rpm"
RPM_HASH = "fe8b1d40005c1f98e9a69365fa29b4afad33372a39a999b7a6d66ad4c65d1307a0d99aef166d8c165e4c3b0c8407cd1ac9f983e52f23bdf9e4fcd1b8f2a4bd80"

RPROVIDES:${PN} += "perl-Getopt--ArgvFile \
perl-Getopt-ArgvFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
