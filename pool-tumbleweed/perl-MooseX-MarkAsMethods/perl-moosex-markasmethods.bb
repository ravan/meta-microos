SUMMARY = "Mark overload code symbols as methods"
DESCRIPTION = "MooseX::MarkAsMethods allows one to easily mark certain functions as Moose \
methods. This will allow other packages such as the namespace::autoclean \
manpage to operate without blowing away your overloads. After using \
MooseX::MarkAsMethods your overloads will be recognized by the Class::MOP \
manpage as being methods, and class extension as well as composition from \
roles with overloads will 'just work'. \
 \
By default we check for overloads, and mark those functions as methods. \
 \
If 'autoclean =&gt; 1' is passed to import on using this module, we will \
invoke namespace::autoclean to clear out non-methods."
LICENSE = "LGPL-2.1+"

PV = "0.15"

RPM_NAME = "perl-MooseX-MarkAsMethods-0.15-5.41.noarch.rpm"
RPM_HASH = "28ed0022d8150917e5369d125d74b80fe340eb39d0fb605e4da659bd904ddb6f03d059a3437076e2de3e8ec569a7c15e396a53554174db418922869e707ff7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--MarkAsMethods \
perl-MooseX--MarkAsMethods--MetaRole--MethodMarker \
perl-MooseX-MarkAsMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Hooks--EndOfScope \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole \
perl-namespace--autoclean"

inherit rpm
