SUMMARY = "Mocking framework with method stubs and behaviour verification"
DESCRIPTION = "Test::Magpie is a test double framework heavily inspired by the Mockito \
framework for Java, and also the Python-Mockito project. In Mockito, you \
'spy' on objects for their behaviour, rather than being upfront about what \
should happen. I find this approach to be significantly more flexible and \
easier to work with than mocking systems like EasyMock, so I created a Perl \
implementation. \
 \
* Mock objects \
 \
Mock objects, represented by Test::Magpie::Mock objects, are objects that \
pretend to be everything you could ever want them to be. A mock object can \
have any method called on it, does every roles, and isa subclass of any \
superclass. This allows you to easily throw a mock object around it will be \
treated as though it was a real object. \
 \
* Method stubbing \
 \
Any method can be called on a mock object, and it will be logged as an \
invocation. By default, method calls return 'undef' in scalar context or an \
empty list in list context. Often, though, clients will be interested in \
the result of calling a method with some arguments. So you may specify how \
a method stub should respond when it is called. \
 \
* Verify interactions \
 \
After calling your concrete code (the code under test) you may want to \
check that the code did operate correctly on the mock. To do this, you can \
use verifications to make sure code was called, with correct parameters and \
the correct amount of times. \
 \
* Argument matching \
 \
Magpie gives you some helpful methods to validate arguments passed in to \
calls. You can check equality between arguments, or consume a general type \
of argument, or consume multiple arguments. See \
Test::Magpie::ArgumentMatcher for the juicy details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Test-Magpie-0.11-1.27.noarch.rpm"
RPM_HASH = "d3d0182fd56b0c3c803b910eeeab8594005047d90d5d2fb4ab826b525ec12a5df50c9ff4778939e936e7cc9eee44d5c2ae65d976830e1b97c6e4a566f6ebf532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Magpie \
perl-Test--Magpie--ArgumentMatcher \
perl-Test--Magpie--Inspect \
perl-Test--Magpie--Invocation \
perl-Test--Magpie--Meta--Class \
perl-Test--Magpie--Mock \
perl-Test--Magpie--Role--HasMock \
perl-Test--Magpie--Role--MethodCall \
perl-Test--Magpie--Stub \
perl-Test--Magpie--Types \
perl-Test--Magpie--Util \
perl-Test--Magpie--Verify \
perl-Test--Magpie--When \
perl-Test-Magpie"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--PartialDump \
perl-Moose \
perl-Moose--Meta--Class \
perl-Moose--Role \
perl-Moose--Util \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Structured \
perl-Set--Object \
perl-UNIVERSAL--ref \
perl-aliased \
perl-experimental \
perl-namespace--autoclean"

inherit rpm
