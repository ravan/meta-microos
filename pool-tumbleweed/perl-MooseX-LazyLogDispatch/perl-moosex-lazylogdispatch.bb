SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-LazyLogDispatch-0.02-10.35.noarch.rpm"
RPM_HASH = "cf571bbcb2d72429ced739fe53e180a010f81d17fd9e717f23ba2a8a987ee67dda9f738d0a4290c1468add027ff1160c92007060d56d7da6e26174485df41216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyLogDispatch \
perl-MooseX--LazyLogDispatch--Levels \
perl-MooseX-LazyLogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
