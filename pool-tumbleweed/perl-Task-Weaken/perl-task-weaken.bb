SUMMARY = "Ensure that a platform has weaken support"
DESCRIPTION = "One recurring problem in modules that use Scalar::Util's 'weaken' function \
is that it is not present in the pure-perl variant. \
 \
While this isn't necessarily always a problem in a straight CPAN-based Perl \
environment, some operating system distributions only include the pure-Perl \
versions, don't include the XS version, and so weaken is then 'missing' \
from the platform, *despite* passing a dependency on Scalar::Util \
successfully. \
 \
Most notably this is RedHat Linux at time of writing, but other come and go \
and do the same thing, hence 'recurring problem'. \
 \
The normal solution is to manually write tests in each distribution to \
ensure that 'weaken' is available. \
 \
This restores the functionality testing to a dependency you do once in your \
_Makefile.PL_, rather than something you have to write extra tests for each \
time you write a module. \
 \
It should also help make the package auto-generators for the various \
operating systems play more nicely, because it introduces a dependency that \
they *have* to have a proper weaken in order to work."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-Task-Weaken-1.06-2.31.noarch.rpm"
RPM_HASH = "36ded072c4411237f4a56c1781ebf1e6e853baa36815403d2dee61ea184fb4972fdbd71dabcffddc6cdd911766fb20cb84b7cf213d1eb0cb10af58dee4f37672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Weaken \
perl-Task-Weaken"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Scalar--Util"

inherit rpm
