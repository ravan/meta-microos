SUMMARY = "Track the number of times subs are called"
DESCRIPTION = "There are a number of different situations (like testing caching code) \
where you want to want to do a number of tests, and then verify that some \
underlying subroutine deep within the code was called a specific number of \
times. \
 \
This module provides a number of functions for doing testing in this way in \
association with your normal Test::More (or similar) test scripts."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.100.0"

RPM_NAME = "perl-Test-SubCalls-1.100.0-1.7.noarch.rpm"
RPM_HASH = "b8ed19a501e9c00536847e7d96953c49cdb101bd78d37f21f36b4e72720bad4553137b42baf4a5e7ec021c11615bae5aec1741c9bca57a92e7759ebaf47d6706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SubCalls \
perl-Test-SubCalls"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Hook--LexWrap"

inherit rpm
