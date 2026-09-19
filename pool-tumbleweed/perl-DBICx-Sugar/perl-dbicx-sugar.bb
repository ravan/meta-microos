SUMMARY = "Just some syntax sugar for DBIx::Class"
DESCRIPTION = "Just some syntax sugar for your DBIx::Class applications. This was \
originally created to remove code duplication between Dancer::Plugin::DBIC \
and Dancer2::Plugin::DBIC."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0200"

RPM_NAME = "perl-DBICx-Sugar-0.0200-1.27.noarch.rpm"
RPM_HASH = "2e4f04dd6e2beb700c4ef5e7f8783f488baf7a84f195fc5949a7e19758e1718eb1d3674d2ab7ce7c56a0fed1dc914de1996cfcbe762e0ae45b5810513c6dfd68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBICx--Sugar \
perl-DBICx-Sugar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBIx--Class \
perl-Module--Load \
perl-SQL--Translator \
perl-YAML"

inherit rpm
