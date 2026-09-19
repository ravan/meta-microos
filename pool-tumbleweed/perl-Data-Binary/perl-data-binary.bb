SUMMARY = "Simple detection of binary versus text in strings"
DESCRIPTION = "This simple module provides string equivalents to the -T / -B operators. \
Since these only work on file names and file handles, this module provides \
the same functions but on strings. \
 \
Note that the actual implementation is currently different, basically \
because the -T / -B functions are in C/XS, and this module is written in \
pure Perl. For now, anyway."
LICENSE = "Artistic-2.0"

PV = "0.01"

RPM_NAME = "perl-Data-Binary-0.01-1.25.noarch.rpm"
RPM_HASH = "72b7cffa780dfcae78b9e7c9c9d4ec63a0bd56ee023d8c574ebaf54bf7879a97ed4004ace9fe03aaebf60f6b34127a85b3ebe3249c191e04afd8e2832dc44628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Binary \
perl-Data-Binary"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
