SUMMARY = "Required attributes which fail only when trying to use them"
DESCRIPTION = "This module adds a 'lazy_required' option to Moose attribute declarations. \
 \
The reader methods for all attributes with that option will throw an \
exception unless a value for the attributes was provided earlier by a \
constructor parameter or through a writer method."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-LazyRequire-0.11-1.41.noarch.rpm"
RPM_HASH = "44e40a39654f3341a2c58469dfd9e322ec3cbb517559bb4fae30e676fa3559ef9fc40d5d340444bdca93fda381907bdc69238a8496cc5c3f8590e4664014ab9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyRequire \
perl-MooseX--LazyRequire--Meta--Attribute--Trait--LazyRequire \
perl-MooseX-LazyRequire"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean"

inherit rpm
