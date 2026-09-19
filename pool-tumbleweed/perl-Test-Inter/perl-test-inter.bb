SUMMARY = "Framework for more readable interactive test scripts"
DESCRIPTION = "This is another framework for writing test scripts. Much of the syntax is \
loosely inspired by Test::More, and Test::Inter has most of it's \
functionality, but it is not a drop-in replacement. \
 \
Test::More (and other existing test frameworks) suffer from two weaknesses, \
both of which have prevented me from ever using them: \
 \
   None offer the ability to access specific tests in \
   a reasonably interactive fashion, primarily for \
   debugging purposes \
 \
   None offer the ability to write the tests in \
   whatever format would make the tests the most \
   readable \
 \
The way I write and use test scripts, existing Test::* modules are not \
nearly as useful as they could be."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.130.0"

RPM_NAME = "perl-Test-Inter-1.130.0-1.1.noarch.rpm"
RPM_HASH = "bf45b4473bff9de118ad78975a3514edad1949b1cf839810c7617a05eb5f9803e34157e2279e99e3911c5b20566772d2b907f4150c55e3ac4658446171fd6f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Inter \
perl-Test-Inter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
