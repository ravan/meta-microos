SUMMARY = "work around buggy code calling UNIVERSAL::can() as a function"
DESCRIPTION = "The UNIVERSAL class provides a few default methods so that all objects can \
use them. Object orientation allows programmers to override these methods \
in subclasses to provide more specific and appropriate behavior. \
 \
Some authors call methods in the UNIVERSAL class on potential invocants as \
functions, bypassing any possible overriding. This is wrong and you should \
not do it. Unfortunately, not everyone heeds this warning and their bad \
code can break your good code. \
 \
This module replaces 'UNIVERSAL::can()' with a method that checks to see if \
the first argument is a valid invocant has its own 'can()' method. If so, \
it gives a warning and calls the overridden method, working around buggy \
code. Otherwise, everything works as you might expect. \
 \
Some people argue that you must call 'UNIVERSAL::can()' as a function \
because you don't know if your proposed invocant is a valid invocant. \
That's silly. Use 'blessed()' from the Scalar::Util manpage if you want to \
check that the potential invocant is an object or call the method anyway in \
an 'eval' block and check for failure (though check the exception \
_returned_, as a poorly-written 'can()' method could break Liskov and throw \
an exception other than 'You can't call a method on this type of \
invocant'). \
 \
Just don't break working code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20140328"

RPM_NAME = "perl-UNIVERSAL-can-1.20140328-3.42.noarch.rpm"
RPM_HASH = "156d7e46f6c4135fcc496ad76cecf1090df8fc4e761503086e2308bac51e49d215361848984675d3724d5581651763b85042ccec745def31c537cf344cb8f003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL--can \
perl-UNIVERSAL-can"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
