SUMMARY = "I/O on in-core objects like strings and arrays"
DESCRIPTION = "This toolkit primarily provides modules for performing both traditional and \
object-oriented i/o) on things _other_ than normal filehandles; in \
particular, IO::Scalar, IO::ScalarArray, and IO::Lines. \
 \
In the more-traditional IO::Handle front, we have IO::AtomicFile which may \
be used to painlessly create files which are updated atomically. \
 \
And in the 'this-may-prove-useful' corner, we have IO::Wrap, whose exported \
wraphandle() function will clothe anything that's not a blessed object in \
an IO::Handle-like wrapper... so you can just use OO syntax and stop \
worrying about whether your function's caller handed you a string, a \
globref, or a FileHandle."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.113"

RPM_NAME = "perl-IO-stringy-2.113-1.29.noarch.rpm"
RPM_HASH = "088d376c961f4c47043a767e1cdf984a6aa35003d4f1281d5eb6e505620752adb5cdc7731cc7844aaa6257794da72f8c6635c61ef42a0d2e355ded730280688f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--AtomicFile \
perl-IO--InnerFile \
perl-IO--Lines \
perl-IO--Scalar \
perl-IO--ScalarArray \
perl-IO--Stringy \
perl-IO--Wrap \
perl-IO--WrapTie \
perl-IO-stringy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
