SUMMARY = "Utilities to test STDOUT and STDERR messages"
DESCRIPTION = "Test::Output provides a simple interface for testing output sent to \
'STDOUT' or 'STDERR'. A number of different utilities are included to try \
and be as flexible as possible to the tester. \
 \
Likewise, Capture::Tiny provides a much more robust capture mechanism \
without than the original Test::Output::Tie."
LICENSE = "Artistic-2.0"

PV = "1.36.0"

RPM_NAME = "perl-Test-Output-1.36.0-1.7.noarch.rpm"
RPM_HASH = "5dace7ef35d40415fd23b1be52c8091818cdf26cc4965639c6e4c51d363596f93c665bc4f86291bd52d69b22800e54118ac2b25c53d4d4d1ce358059823141eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Output \
perl-Test-Output"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-File--Temp"

inherit rpm
