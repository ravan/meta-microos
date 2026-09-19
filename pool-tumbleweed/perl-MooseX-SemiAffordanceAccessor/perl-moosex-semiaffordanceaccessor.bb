SUMMARY = "Name your accessors foo() and set_foo()"
DESCRIPTION = "This module does not provide any methods. Simply loading it changes the \
default naming policy for the loading class so that accessors are separated \
into get and set methods. The get methods have the same name as the \
accessor, while set methods are prefixed with 'set_'. \
 \
If you define an attribute with a leading underscore, then the set method \
will start with '_set_'. \
 \
If you explicitly set a 'reader' or 'writer' name when creating an \
attribute, then that attribute's naming scheme is left unchanged. \
 \
The name 'semi-affordance' comes from David Wheeler's Class::Meta module."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-MooseX-SemiAffordanceAccessor-0.10-1.41.noarch.rpm"
RPM_HASH = "ab0722abf0967c15385282f06fb3fba9aa6fb3f888352cf392d9e05c35d7e5031ae15021285e16a9dda106c1a48245165bfe7cf76074e656cbee4950ea443c83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--SemiAffordanceAccessor \
perl-MooseX--SemiAffordanceAccessor--Role--Attribute \
perl-MooseX-SemiAffordanceAccessor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util--MetaRole"

inherit rpm
