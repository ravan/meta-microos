SUMMARY = "(DEPRECATED) Adding keywords to perl, in perl"
DESCRIPTION = "Devel::Declare can install subroutines called declarators which locally \
take over Perl's parser, allowing the creation of new syntax. \
 \
This document describes how to create a simple declarator."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006022"

RPM_NAME = "perl-Devel-Declare-0.006022-1.36.aarch64.rpm"
RPM_HASH = "319c92d64a0e62403b5056423117fe6d461f270f2cc49ee2364ea5c9f670af12c54a0156231b11d3dee52e84820950d1fdc242a8aa4a27e12cfe0da8cb9c0dc0"

RPROVIDES:${PN} += "perl-Devel--Declare \
perl-Devel--Declare--Context--Simple \
perl-Devel--Declare--MethodInstaller--Simple \
perl-Devel-Declare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-B--Hooks--EndOfScope \
perl-B--Hooks--OP--Check \
perl-Sub--Name"

inherit rpm
