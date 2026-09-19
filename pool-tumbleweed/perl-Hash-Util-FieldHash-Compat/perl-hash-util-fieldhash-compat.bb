SUMMARY = "Use Hash::Util::FieldHash or ties, depending on availability"
DESCRIPTION = "Under older perls this module provides a drop-in compatible API to \
Hash::Util::FieldHash using perltie. When Hash::Util::FieldHash is \
available it will use that instead. \
 \
This way code requiring field hashes can benefit from fast, robust field \
hashes on Perl 5.10 and newer, but still run on older perls that don't ship \
with that module. \
 \
See Hash::Util::FieldHash for all the details of the API."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Hash-Util-FieldHash-Compat-0.11-1.39.noarch.rpm"
RPM_HASH = "bf40db2d9e655776c003c29531a5ca05617e446b26f479e24ffe73df076957e486f1690009cc2ba73d91ac08fbdc43940db6ffd2efa568d1ea89489b452b1d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Util--FieldHash--Compat \
perl-Hash--Util--FieldHash--Compat--Heavy \
perl-Hash-Util-FieldHash-Compat"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
