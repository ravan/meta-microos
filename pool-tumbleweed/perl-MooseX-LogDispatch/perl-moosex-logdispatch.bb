SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.2002"

RPM_NAME = "perl-MooseX-LogDispatch-1.2002-10.35.noarch.rpm"
RPM_HASH = "94a55504cb3c0527e9f86e4a5ba19c4b3b16403a058d3394f7ced0e4895682dfbfa7b8d87ea87e6ff8378be3999c0ae5aa8a4dc49a51846c472dca029573a024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LogDispatch \
perl-MooseX--LogDispatch--Levels \
perl-MooseX-LogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
