SUMMARY = "Information about Perl modules"
DESCRIPTION = "Module::Info gives you information about Perl modules *without actually \
loading the module*. It actually isn't specific to modules and should work \
on any perl code."
LICENSE = "SUSE-Public-Domain"

PV = "0.390.0"

RPM_NAME = "perl-Module-Info-0.390.0-1.10.noarch.rpm"
RPM_HASH = "630c092bdfcc74dea98f3d1224d512cf16eacab936bdcd36eca5f7f72148474e582117ea467f4ac38ff6193e8c6d6551d95ab69a9b090da92bb65b28245c0aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Module--Info \
perl-Module--Info \
perl-Module--Info---version \
perl-Module--Info--Safe \
perl-Module--Info--Unsafe \
perl-Module-Info"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-B--Utils"

inherit rpm
