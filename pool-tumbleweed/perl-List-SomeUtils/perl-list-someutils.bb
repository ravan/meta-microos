SUMMARY = "Provide the stuff missing in List::Util"
DESCRIPTION = "*List::SomeUtils* provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util. \
 \
All of the below functions are implementable in only a couple of lines of \
Perl code. Using the functions from this module however should give \
slightly better performance as everything is implemented in C. The \
pure-Perl implementation of these functions only serves as a fallback in \
case the C portions of this module couldn't be compiled on this machine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.59"

RPM_NAME = "perl-List-SomeUtils-0.59-1.18.noarch.rpm"
RPM_HASH = "928aeebea71e9e4cb42e70ad17c3e74a02c3020b7da58342afd7ffe4c76b6c126c272a44f7bb808efd154b974229d8727c3ff456a6c4e0624af2a2b347855033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--SomeUtils \
perl-List--SomeUtils--PP \
perl-List-SomeUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--SomeUtils--XS \
perl-Module--Implementation"

inherit rpm
