SUMMARY = "Dynamic generation of tests in nested combinations of contexts"
DESCRIPTION = "Test::WriteVariants is a utility to create variants of a common test. \
 \
Given the situation - like in DBI where some tests are the same for \
DBI::SQL::Nano and it's drop-in replacement SQL::Statement. Or a \
distribution duo having a Pure-Perl and an XS variant - and the same test \
shall be used to ensure XS and PP version are really drop-in replacements \
for each other."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.014"

RPM_NAME = "perl-Test-WriteVariants-0.014-1.33.noarch.rpm"
RPM_HASH = "0d1696233ccd5f956fdc590429d1dd60873f1f911d458ec8ea8078531cbec30a58a333aa3a8c5cf364bcb0af1a43cba72587b4b9a74059cc3a4be103fd187c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--WriteVariants \
perl-Test--WriteVariants--Context \
perl-Test--WriteVariants--Context--BaseItem \
perl-Test--WriteVariants--Context--EnvVar \
perl-Test--WriteVariants--Context--MetaInfo \
perl-Test--WriteVariants--Context--ModuleUse \
perl-Test--WriteVariants--Context--OurVar \
perl-Test-WriteVariants"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Tumbler \
perl-Module--Pluggable--Object \
perl-Module--Runtime"

inherit rpm
