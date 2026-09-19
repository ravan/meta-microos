SUMMARY = "DelimMatch for Locating Delimited Substrings with Proper Nesting"
DESCRIPTION = "DelimMatch is a Perl 5 module that provides functions for locating \
delimited substrings with proper nesting."
LICENSE = "Artistic-1.0"

PV = "1.06"

RPM_NAME = "perl-Text-DelimMatch-1.06-10.46.aarch64.rpm"
RPM_HASH = "476b888eca5b29248220082ce4a72112c2d892e592238c824b8d16f19f1f7d672472f396954c8633826e7a28ddcdc97b6fcf6396cd0ce670782f2ca03663defd"

RPROVIDES:${PN} += "perl-Text--DelimMatch \
perl-Text-DelimMatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
