SUMMARY = "Looking up module information / loading at runtime"
DESCRIPTION = "Module::Load::Conditional provides simple ways to query and possibly load \
any of the modules you have installed on your system during runtime. \
 \
It is able to load multiple modules at once or none at all if one of them \
was not able to load. It also takes care of any error checking and so \
forth."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.74"

RPM_NAME = "perl-Module-Load-Conditional-0.74-1.28.noarch.rpm"
RPM_HASH = "8dc529a1e8b84f7a56a3e85976a70ec9f34fc5d3c5bb67a6bfaca891b98d695ea1070ff87f58a7ef149fc234b3ceb928f136b30b3fd245734bce2d8fd3c65fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Load--Conditional \
perl-Module-Load-Conditional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Locale--Maketext--Simple \
perl-Module--CoreList \
perl-Module--Load \
perl-Module--Metadata \
perl-Params--Check \
perl-version"

inherit rpm
