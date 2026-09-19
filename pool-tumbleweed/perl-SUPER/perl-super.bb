SUMMARY = "Control superclass method dispatch"
DESCRIPTION = "When subclassing a class, you occasionally want to dispatch control to the \
superclass -- at least conditionally and temporarily. The Perl syntax for \
calling your superclass is ugly and unwieldy: \
 \
    $self->SUPER::method(@_); \
 \
especially when compared to its Ruby equivalent: \
 \
    super; \
 \
It's even worse in that the normal Perl redispatch mechanism only \
dispatches to the parent of the class containing the method _at compile \
time_. That doesn't work very well for mixins and roles. \
 \
This module provides nicer equivalents, along with the universal method \
'super' to determine a class' own superclass. This allows you to do things \
such as: \
 \
    goto &{$_[0]->super('my_method')}; \
 \
if you don't like wasting precious stack frames. \
 \
If you are using roles or mixins or otherwise pulling in methods from other \
packages that need to dispatch to their super methods, or if you want to \
pass different arguments to the super method, use the 'SUPER()' method: \
 \
    $self->SUPER( qw( other arguments here ) );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20190531"

RPM_NAME = "perl-SUPER-1.20190531-1.31.noarch.rpm"
RPM_HASH = "0d714010bb32eb7e1485c99998f18bfbd9734afee0498f9f9044e44840d6b589d219beed18eb45d947f0411a8d81d846c9885437d4523af9d1da03bac4cb185f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SUPER"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Scalar--Util \
perl-Sub--Identify"

inherit rpm
