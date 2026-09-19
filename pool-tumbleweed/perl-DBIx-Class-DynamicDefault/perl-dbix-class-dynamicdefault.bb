SUMMARY = "Automatically set and update fields"
DESCRIPTION = "Automatically set and update fields with values calculated at runtime."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-DBIx-Class-DynamicDefault-0.04-2.35.noarch.rpm"
RPM_HASH = "775391736970ba5f23436864e2c3d4eb72f218a95c575c72f0c55645d9d4e3d324ba4106371fde82adee14fd179ae414d39528a032da75bba49e93618f984794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--DynamicDefault \
perl-DBIx-Class-DynamicDefault"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBIx--Class"

inherit rpm
