SUMMARY = "Error/exception handling in an OO-ish way"
DESCRIPTION = "The 'Error' package provides two interfaces. Firstly 'Error' provides a \
procedural interface to exception handling. Secondly 'Error' is a base \
class for errors/exceptions that can either be thrown, for subsequent \
catch, or can simply be recorded. \
 \
Errors in the class 'Error' should not be thrown directly, but the user \
should throw errors from a sub-class of 'Error'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.300"

RPM_NAME = "perl-Error-0.170.300-1.9.noarch.rpm"
RPM_HASH = "5d13eea99918eef629021d59b3ba6573f5216fbcdf02025003fd4591b2b0fa99c07ffa19e12c95d6924d3212f7a92d4f92b98a97a95d96a5b19429fede08f179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Error \
perl-Error--Simple \
perl-Error--WarnDie \
perl-Error--subs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
