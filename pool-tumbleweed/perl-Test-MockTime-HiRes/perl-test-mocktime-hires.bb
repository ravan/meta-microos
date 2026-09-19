SUMMARY = "Replaces actual time with simulated high resolution time"
DESCRIPTION = "'Test::MockTime::HiRes' is a Time::HiRes compatible version of \
Test::MockTime. You can wait milliseconds in simulated time. \
 \
It also provides 'mock_time' to restrict the effect of the simulation in a \
code block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-Test-MockTime-HiRes-0.08-1.17.noarch.rpm"
RPM_HASH = "86dbd564a1df05690fd5131a9094ee9d95341c4e48c1483e754c9d20afbaaa79b80b4ca920d6fabede422a882be59ee0fe3c30c200294fdbf3dd9b9b9d12f18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime--HiRes \
perl-Test-MockTime-HiRes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--MockTime"

inherit rpm
