SUMMARY = "Extremely flexible deep comparison"
DESCRIPTION = "If you don't know anything about automated testing in Perl then you should \
probably read about Test::Simple and Test::More before preceding. \
Test::Deep uses the Test::Builder framework. \
 \
Test::Deep gives you very flexible ways to check that the result you got is \
the result you were expecting. At its simplest it compares two structures \
by going through each level, ensuring that the values match, that arrays \
and hashes have the same elements and that references are blessed into the \
correct class. It also handles circular data structures without getting \
caught in an infinite loop. \
 \
Where it becomes more interesting is in allowing you to do something \
besides simple exact comparisons. With strings, the 'eq' operator checks \
that 2 strings are exactly equal but sometimes that's not what you want. \
When you don't know exactly what the string should be but you do know some \
things about how it should look, 'eq' is no good and you must use pattern \
matching instead. Test::Deep provides pattern matching for complex data \
structures \
 \
Test::Deep has *_a lot_* of exports. See EXPORTS below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.205.0"

RPM_NAME = "perl-Test-Deep-1.205.0-1.8.noarch.rpm"
RPM_HASH = "543d407a3a7c1c37820f75ba8f9b378fd3baed5505b430346315d0defd054072d128345f2c81d3d227927a755eb11c5f1c715ff610a139e710072c1178589c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Over \
perl-Test--Deep \
perl-Test--Deep--All \
perl-Test--Deep--Any \
perl-Test--Deep--Array \
perl-Test--Deep--ArrayEach \
perl-Test--Deep--ArrayElementsOnly \
perl-Test--Deep--ArrayLength \
perl-Test--Deep--ArrayLengthOnly \
perl-Test--Deep--Blessed \
perl-Test--Deep--Boolean \
perl-Test--Deep--Cache \
perl-Test--Deep--Cache--Simple \
perl-Test--Deep--Class \
perl-Test--Deep--Cmp \
perl-Test--Deep--Code \
perl-Test--Deep--Hash \
perl-Test--Deep--HashEach \
perl-Test--Deep--HashElements \
perl-Test--Deep--HashKeys \
perl-Test--Deep--HashKeysOnly \
perl-Test--Deep--Ignore \
perl-Test--Deep--Isa \
perl-Test--Deep--ListMethods \
perl-Test--Deep--MM \
perl-Test--Deep--Methods \
perl-Test--Deep--NoTest \
perl-Test--Deep--None \
perl-Test--Deep--Number \
perl-Test--Deep--Obj \
perl-Test--Deep--Ref \
perl-Test--Deep--RefType \
perl-Test--Deep--Regexp \
perl-Test--Deep--RegexpMatches \
perl-Test--Deep--RegexpOnly \
perl-Test--Deep--RegexpRef \
perl-Test--Deep--RegexpRefOnly \
perl-Test--Deep--RegexpVersion \
perl-Test--Deep--ScalarRef \
perl-Test--Deep--ScalarRefOnly \
perl-Test--Deep--Set \
perl-Test--Deep--Shallow \
perl-Test--Deep--Stack \
perl-Test--Deep--String \
perl-Test-Deep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More \
perl-Test--Simple"

inherit rpm
