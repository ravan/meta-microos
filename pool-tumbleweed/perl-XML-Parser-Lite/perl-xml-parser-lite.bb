SUMMARY = "Lightweight pure-perl XML Parser (based on regexps)"
DESCRIPTION = "This module implements an XML parser with a interface similar to \
XML::Parser. Though not all callbacks are supported, you should be able to \
use it in the same way you use XML::Parser. Due to using experimental \
regexp features it'll work only on Perl 5.6 and above and may behave \
differently on different platforms. \
 \
Note that you cannot use regular expressions or split in callbacks. This is \
due to a limitation of perl's regular expression implementation (which is \
not re-entrant)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.722"

RPM_NAME = "perl-XML-Parser-Lite-0.722-1.32.noarch.rpm"
RPM_HASH = "a9202a9842acad0f590ef2b0fc9863f9f19e397f6b69ce44c46e700c0dfdef4cb3bb92547116af2fd438fac5c64dc54e4c7a70c7dddc87e9b6e06522e159ea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Parser--Lite \
perl-XML-Parser-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
