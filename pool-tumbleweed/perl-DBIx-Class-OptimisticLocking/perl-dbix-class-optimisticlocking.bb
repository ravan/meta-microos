SUMMARY = "Optimistic locking support for DBIx::Class"
DESCRIPTION = "Optimistic locking support for DBIx::Class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-DBIx-Class-OptimisticLocking-0.02-1.42.noarch.rpm"
RPM_HASH = "47fa76c88c33b34d923dd97978abef53348bfda7fcdc39b3dffcf42f2430f68c861b575367970b460dfa43357a9b022959a631befcd8aa0d1b47b1cf528431f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--OptimisticLocking \
perl-DBIx-Class-OptimisticLocking"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBIx--Class"

inherit rpm
