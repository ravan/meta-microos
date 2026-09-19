SUMMARY = "Parse and format W3CDTF datetime strings"
DESCRIPTION = "This module understands the W3CDTF date/time format, an ISO 8601 profile, \
defined at http://www.w3.org/TR/NOTE-datetime. This format as the native \
date format of RSS 1.0. \
 \
It can be used to parse these formats in order to create the appropriate \
objects."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-DateTime-Format-W3CDTF-0.90.0-1.1.noarch.rpm"
RPM_HASH = "f6cedf6e2e1a5f6f7c1bfb478abbf9418448f9e22e2bdf6ab12475227a2b8fa2637673ab5b5cd910baf24ee42b01d74ea337b4216d5a7354d511e592bbf6933a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--W3CDTF \
perl-DateTime-Format-W3CDTF"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime"

inherit rpm
