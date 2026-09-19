SUMMARY = "Load mix-ins or components to your C3-based class"
DESCRIPTION = "This will inject base classes to your module using the Class::C3 method \
resolution order. \
 \
Please note: these are not plugins that can take precedence over methods \
declared in MyModule. If you want something like that, consider \
MooseX::Object::Pluggable."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001002"

RPM_NAME = "perl-Class-C3-Componentised-1.001002-1.33.noarch.rpm"
RPM_HASH = "e88536a110390ff681eb028212282087144ee245a1b3342026338d7773e0a2b840f7125e3e8f72092f393ac85cef65238b2ec0018725888788a1ebf716fc01f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Componentised \
perl-Class--C3--Componentised--ApplyHooks \
perl-Class-C3-Componentised"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--C3 \
perl-Class--Inspector \
perl-MRO--Compat"

inherit rpm
