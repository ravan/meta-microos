SUMMARY = "Functions for working with L<IO::Handle> like objects"
DESCRIPTION = "This module provides a number of helpful routines to manipulate or create \
IO::Handle like objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-IO-Handle-Util-0.02-1.33.noarch.rpm"
RPM_HASH = "253a0058749dc166fbff114efc5025c3bada75805f8932ed4f4c17a03a94e7ff0eee34e71ada59ceaabe7748b223d799d3fe45e6106565f75bab6c94c73f754a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Handle--Iterator \
perl-IO--Handle--Iterator--Buffered \
perl-IO--Handle--Prototype \
perl-IO--Handle--Prototype--Fallback \
perl-IO--Handle--Util \
perl-IO--Handle--Util--Overloading \
perl-IO--Handle--Util--Tie \
perl-IO-Handle-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--String \
perl-Sub--Exporter \
perl-asa \
perl-autodie \
perl-parent"

inherit rpm
