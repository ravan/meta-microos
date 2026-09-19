SUMMARY = "Collection of Modules Removed From Module-Build"
DESCRIPTION = "This module contains a number of module that have been removed from \
Module-Build: \
 \
* * Module::Build::ModuleInfo \
 \
This has been superceded by Module::Metadata \
 \
* * Module::Build::Version \
 \
This has been replaced by version \
 \
* * Module::Build::YAML \
 \
This has been replaced by CPAN::Meta::YAML"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.4210"

RPM_NAME = "perl-Module-Build-Deprecated-0.4210-1.39.noarch.rpm"
RPM_HASH = "af7ed76312e3ac2db669798f46c7b1445a0490f4e6a6d2e448f2731acbb8b4172ce5291e855df6f2d00d1298a259372e2d1d3e434e2cd6310d1c81924d6b5166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Deprecated \
perl-Module--Build--ModuleInfo \
perl-Module--Build--Version \
perl-Module--Build--YAML \
perl-Module-Build-Deprecated"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--YAML \
perl-Module--Metadata \
perl-parent \
perl-version"

inherit rpm
