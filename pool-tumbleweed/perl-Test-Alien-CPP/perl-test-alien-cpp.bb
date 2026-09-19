SUMMARY = "Testing tools for Alien modules for projects that use C++"
DESCRIPTION = "This module works exactly like Test::Alien except that it supports C++. All \
functions like 'alien_ok', etc that are exported by Test::Alien are \
exported by this module. The only difference is that 'xs_ok' injects C++ \
support before delegating to Test::Alien."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.40.0"

RPM_NAME = "perl-Test-Alien-CPP-1.40.0-1.10.noarch.rpm"
RPM_HASH = "15d72bcc93e7ec312c284360984e2722f055ad5c4543f4c1bb2265f6ac86672f01a11c351f06b407d7c75d27c950a22343318cf97afaa586073f56d79d8be78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Alien--CPP \
perl-Test--Alien--CanCompileCpp \
perl-Test-Alien-CPP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CppGuess \
perl-Test--Alien \
perl-Test--Alien--Build \
perl-Test2--Require"

inherit rpm
