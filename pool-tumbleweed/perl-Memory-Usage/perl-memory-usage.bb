SUMMARY = "Tools to determine actual memory usage"
DESCRIPTION = "This module lets you attempt to measure, from your operating system's \
perspective, how much memory a process is using at any given time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.201.0"

RPM_NAME = "perl-Memory-Usage-0.201.0-1.6.noarch.rpm"
RPM_HASH = "8847a7faa5181e11a71b0b5e8462197fbc8dd827d8daa8fa1e6e439f2597a1843e4ee2c8c225112d5bdf69f3ad4091b798d42aad841837c7cbace27d1528ffb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Memory--Usage \
perl-Memory-Usage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
