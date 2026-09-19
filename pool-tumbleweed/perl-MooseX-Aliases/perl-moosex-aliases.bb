SUMMARY = "easy aliasing of methods and attributes in Moose"
DESCRIPTION = "The MooseX::Aliases module will allow you to quickly alias methods in \
Moose. It provides an alias parameter for 'has()' to generate aliased \
accessors as well as the standard ones. Attributes can also be initialized \
in the constructor via their aliased names. \
 \
You can create more than one alias at once by passing a arrayref: \
 \
    has ip_addr => ( \
        alias => [ qw(ipAddr ip) ], \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-Aliases-0.11-5.41.noarch.rpm"
RPM_HASH = "0417e5a0aafbc4d3788cd89cb3910a9844cd185df759d1525859865e0f8d49dcb4c3dc5b303e732077d0239f12513fd0a3fa95665f8f91d8dd0a53ab662c5b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Aliases \
perl-MooseX--Aliases--Meta--Trait--Attribute \
perl-MooseX--Aliases--Meta--Trait--Class \
perl-MooseX--Aliases--Meta--Trait--Method \
perl-MooseX--Aliases--Meta--Trait--Role \
perl-MooseX--Aliases--Meta--Trait--Role--ApplicationToClass \
perl-MooseX--Aliases--Meta--Trait--Role--ApplicationToRole \
perl-MooseX--Aliases--Meta--Trait--Role--Composite \
perl-MooseX-Aliases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints"

inherit rpm
