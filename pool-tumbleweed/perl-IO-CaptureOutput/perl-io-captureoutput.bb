SUMMARY = "(DEPRECATED) capture STDOUT and STDERR from Perl code, subprocesses or XS"
DESCRIPTION = "*This module is no longer recommended by the maintainer* - see \
Capture::Tiny instead. \
 \
This module provides routines for capturing STDOUT and STDERR from perl \
subroutines, forked system calls (e.g. 'system()', 'fork()') and from XS or \
C modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1105"

RPM_NAME = "perl-IO-CaptureOutput-1.1105-1.31.noarch.rpm"
RPM_HASH = "6e27a6f577ce0ba3104bb5068e79126bf4302dbb7a8f42884269cc3b531ae49e24f19802887466bd8fc87bbe1baf61cf15e70b310064184a37285cdcd2d766b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--CaptureOutput \
perl-IO--CaptureOutput---proxy \
perl-IO-CaptureOutput"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
