SUMMARY = "Simple sub-process management for asynchronous tasks"
DESCRIPTION = "MooseX::Workers is a Role that provides easy delegation of long-running \
tasks into a managed child process. Process management is taken care of via \
POE and its POE::Wheel::Run module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-MooseX-Workers-0.24-1.41.noarch.rpm"
RPM_HASH = "3888cc3b42245ffa835b1e35cce880292f9fd9cf79440f4a597f1c87831ac5e7b0bc137ae5a75676db28555fea8260d93b6da8bfa1072719e14123fd3ce34904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Workers \
perl-MooseX--Workers--Engine \
perl-MooseX--Workers--Job \
perl-MooseX-Workers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Role \
perl-POE \
perl-POE--Wheel--Run \
perl-Package--Stash \
perl-Try--Tiny"

inherit rpm
