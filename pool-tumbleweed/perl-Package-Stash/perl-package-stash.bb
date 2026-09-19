SUMMARY = "Routines for manipulating stashes"
DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, but \
incredibly messy, and easy to get wrong. This module hides all of that \
behind a simple API. \
 \
NOTE: Most methods in this class require a variable specification that \
includes a sigil. If this sigil is absent, it is assumed to represent the \
IO slot. \
 \
Due to limitations in the typeglob API available to perl code, and to \
typeglob manipulation in perl being quite slow, this module provides two \
implementations - one in pure perl, and one using XS. The XS implementation \
is to be preferred for most usages; the pure perl one is provided for cases \
where XS modules are not a possibility. The current implementation in use \
can be set by setting '$ENV{PACKAGE_STASH_IMPLEMENTATION}' or \
'$Package::Stash::IMPLEMENTATION' before loading Package::Stash (with the \
environment variable taking precedence), otherwise, it will use the XS \
implementation if possible, falling back to the pure perl one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.400.0"

RPM_NAME = "perl-Package-Stash-0.400.0-1.7.noarch.rpm"
RPM_HASH = "fc437eef8cfe4b477025e58c2f67066c001d840d4fba1115efa00429172739a253146e56697a27e792722131ec1c23a196ca817b9ccac0b967a1cf177703c039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Stash \
perl-Package--Stash--PP \
perl-Package-Stash"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Dist--CheckConflicts \
perl-Module--Implementation"

inherit rpm
