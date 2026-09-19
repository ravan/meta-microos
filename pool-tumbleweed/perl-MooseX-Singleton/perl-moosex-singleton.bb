SUMMARY = "Turn your Moose class into a singleton"
DESCRIPTION = "A singleton is a class that has only one instance in an application. \
'MooseX::Singleton' lets you easily upgrade (or downgrade, as it were) your \
Moose class to a singleton. \
 \
All you should need to do to transform your class is to change 'use Moose' \
to 'use MooseX::Singleton'. This module uses metaclass roles to do its \
magic, so it should cooperate with most other 'MooseX' modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MooseX-Singleton-0.30-1.38.noarch.rpm"
RPM_HASH = "b931144f9f717f72c6842c4efc37df01871563db18d01e79a1b2385f21f1753169a10d29f445ac4143827f04df93ab633257cf2e975c252048b123de5e7f8297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Singleton \
perl-MooseX--Singleton--Role--Meta--Class \
perl-MooseX--Singleton--Role--Meta--Instance \
perl-MooseX--Singleton--Role--Meta--Method--Constructor \
perl-MooseX--Singleton--Role--Object \
perl-MooseX-Singleton"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role"

inherit rpm
