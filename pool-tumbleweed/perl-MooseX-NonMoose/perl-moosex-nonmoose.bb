SUMMARY = "Easy subclassing of non-Moose classes"
DESCRIPTION = "'MooseX::NonMoose' allows for easily subclassing non-Moose classes with \
Moose, taking care of the annoying details connected with doing this, such \
as setting up proper inheritance from Moose::Object and installing (and \
inlining, at 'make_immutable' time) a constructor that makes sure things \
like 'BUILD' methods are called. It tries to be as non-intrusive as \
possible - when this module is used, inheriting from non-Moose classes and \
inheriting from Moose classes should work identically, aside from the few \
caveats mentioned below. One of the goals of this module is that including \
it in a Moose::Exporter-based package used across an entire application \
should be possible, without interfering with classes that only inherit from \
Moose modules, or even classes that don't inherit from anything at all. \
 \
There are several ways to use this module. The most straightforward is to \
just 'use MooseX::NonMoose;' in your class; this should set up everything \
necessary for extending non-Moose modules. \
MooseX::NonMoose::Meta::Role::Class and \
MooseX::NonMoose::Meta::Role::Constructor can also be applied to your \
metaclasses manually, either by passing a '-traits' option to your 'use \
Moose;' line, or by applying them using Moose::Util::MetaRole in a \
Moose::Exporter-based package. MooseX::NonMoose::Meta::Role::Class is the \
part that provides the main functionality of this module; if you don't care \
about inlining, this is all you need to worry about. Applying \
MooseX::NonMoose::Meta::Role::Constructor as well will provide an inlined \
constructor when you immutabilize your class. \
 \
'MooseX::NonMoose' allows you to manipulate the argument list that gets \
passed to the superclass constructor by defining a 'FOREIGNBUILDARGS' \
method. This is called with the same argument list as the 'BUILDARGS' \
method, but should return a list of arguments to pass to the superclass \
constructor. This allows 'MooseX::NonMoose' to support superclasses whose \
constructors would get confused by the extra arguments that Moose requires \
(for attributes, etc.) \
 \
Not all non-Moose classes use 'new' as the name of their constructor. This \
module allows you to extend these classes by explicitly stating which \
method is the constructor, during the call to 'extends'. The syntax looks \
like this: \
 \
  extends 'Foo' => { -constructor_name => 'create' }; \
 \
similar to how you can already pass '-version' in the 'extends' call in a \
similar way."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-MooseX-NonMoose-0.270.0-1.10.noarch.rpm"
RPM_HASH = "9c6a428622ad6ba4286babccbc8805a0b52d0db26f33516d0aca224ec5461174894c4fa0c7d9df26045cdd5eba166fbfbc36902fb2ed7b08c1036629a63c5376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--NonMoose \
perl-MooseX--NonMoose--InsideOut \
perl-MooseX--NonMoose--Meta--Role--Class \
perl-MooseX--NonMoose--Meta--Role--Constructor \
perl-MooseX-NonMoose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-Module--Runtime \
perl-Moose--Exporter \
perl-Moose--Role \
perl-Moose--Util \
perl-Try--Tiny"

inherit rpm
