SUMMARY = "Thing you can identify somehow"
DESCRIPTION = "Role::Identifiable isn't really a module that does anything. It's here to \
make things simpler for indexing on CPAN and looking up docs. \
 \
You probably want to use either Role::Identifiable::HasIdent, for \
identifying things by an identifier string, or Role::Identifiable::HasTags \
for identifying things by a list of tags."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-Role-Identifiable-0.009-1.18.noarch.rpm"
RPM_HASH = "e38aa2ccc7c40f91e86d50f43ea49696b880242cb6fb7e06a775f0ebae67822c6170cc087b46fd408b39c124872b52daf0999a5f872442e5f3416e41031c178a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Identifiable \
perl-Role--Identifiable--HasIdent \
perl-Role--Identifiable--HasTags \
perl-Role-Identifiable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
