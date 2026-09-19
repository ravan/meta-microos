SUMMARY = "Easily create test classes in an xUnit/JUnit style"
DESCRIPTION = "Test::Class provides a simple way of creating classes and objects to test \
your code in an xUnit style. \
 \
Built using Test::Builder, it was designed to work with other Test::Builder \
based modules (Test::More, Test::Differences, Test::Exception, etc.). \
 \
_Note:_ This module will make more sense, if you are already familiar with \
the 'standard' mechanisms for testing perl code. Those unfamiliar with \
Test::Harness, Test::Simple, Test::More and friends should go take a look \
at them now. Test::Tutorial is a good starting point."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.520.0"

RPM_NAME = "perl-Test-Class-0.520.0-1.5.noarch.rpm"
RPM_HASH = "e3273e3d666a822110f3a91fd96484616b60323a3de0430f1271bf4edc9bd0451310ca570363c0782bb40305959a8d6904eccff5d9ec8d55e7b51f0ad06d6715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Class \
perl-Test--Class--Load \
perl-Test--Class--MethodInfo \
perl-Test-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Test--Builder \
perl-Test--Simple \
perl-Try--Tiny"

inherit rpm
