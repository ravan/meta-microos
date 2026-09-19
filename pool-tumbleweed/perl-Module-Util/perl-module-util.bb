SUMMARY = "Module name tools and transformations"
DESCRIPTION = "This module provides a few useful functions for manipulating module names. \
Its main aim is to centralise some of the functions commonly used by \
modules that manipulate other modules in some way, like converting module \
names to relative paths."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-Module-Util-1.09-1.31.noarch.rpm"
RPM_HASH = "128a70b7223f9abef9774d69fba861874db011a2929ed35544d13f25ad192453b774c5c430795c07f967163d64a3e9859d4996441cb4f250c600710a2ef1e2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Util \
perl-Module-Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
