SUMMARY = "Fork test"
DESCRIPTION = "Test::SharedFork is utility module for Test::Builder. \
 \
This module makes fork(2) safety in your test case. \
 \
This module merges test count with parent process & child process."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.350.0"

RPM_NAME = "perl-Test-SharedFork-0.350.0-1.5.noarch.rpm"
RPM_HASH = "648c19d4c66f3d9b7dcf8b1993dc7aec7f44c24d21ed70399e9ba66928e4282131484811564311f61653b0383011e2645bcd5c6ef17651f2882a52c5d2e8d3f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SharedFork \
perl-Test--SharedFork--Array \
perl-Test--SharedFork--Scalar \
perl-Test--SharedFork--Store \
perl-Test-SharedFork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
