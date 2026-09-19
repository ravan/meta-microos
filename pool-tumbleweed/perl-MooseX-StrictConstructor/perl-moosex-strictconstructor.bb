SUMMARY = "Make your object constructors blow up on unknown attributes"
DESCRIPTION = "Simply loading this module makes your constructors 'strict'. If your \
constructor is called with an attribute init argument that your class does \
not declare, then it calls 'Moose->throw_error()'. This is a great way to \
catch small typos."
LICENSE = "Artistic-2.0"

PV = "0.21"

RPM_NAME = "perl-MooseX-StrictConstructor-0.21-1.38.noarch.rpm"
RPM_HASH = "5e8f89cba670851ab65757b4680b72039307f427e4f364c8a0d2e7b554a71072aa28f61be84ea4880633bb2c4cf5ecbf14ad327db719b735630ccff942d044e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--StrictConstructor \
perl-MooseX--StrictConstructor--Trait--Class \
perl-MooseX--StrictConstructor--Trait--Method--Constructor \
perl-MooseX-StrictConstructor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
