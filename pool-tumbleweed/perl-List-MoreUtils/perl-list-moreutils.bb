SUMMARY = "Provide the stuff missing in List::Util"
DESCRIPTION = "*List::MoreUtils* provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util. \
 \
All of the below functions are implementable in only a couple of lines of \
Perl code. Using the functions from this module however should give \
slightly better performance as everything is implemented in C. The \
pure-Perl implementation of these functions only serves as a fallback in \
case the C portions of this module couldn't be compiled on this machine."
LICENSE = "Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-0.430-1.28.noarch.rpm"
RPM_HASH = "11a4510c8d2211e87498c1ba9991a82fe05646656d36f36bb97c6a5bb246c89811218f0dd2a9061aa0e967669994f844f86888ccb179ceb988e7622d4ad8d746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--MoreUtils \
perl-List--MoreUtils--PP \
perl-List-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Tiny \
perl-List--MoreUtils--XS"

inherit rpm
