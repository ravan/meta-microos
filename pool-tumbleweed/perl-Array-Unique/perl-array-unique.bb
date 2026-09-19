SUMMARY = "Tie-able array that allows only unique values"
DESCRIPTION = "This package lets you create an array which will allow only one occurrence \
of any value. \
 \
In other words no matter how many times you put in 42 it will keep only the \
first occurrence and the rest will be dropped. \
 \
You use the module via tie and once you tied your array to this module it \
will behave correctly. \
 \
Uniqueness is checked with the 'eq' operator so among other things it is \
case sensitive. \
 \
As a side effect the module does not allow undef as a value in the array."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.90.0"

RPM_NAME = "perl-Array-Unique-0.90.0-1.7.noarch.rpm"
RPM_HASH = "1d5059af4ac64396c7c6840311c1918ae3e071160362cf67ecadd5ebfd975b0fa892c7f780de45ec23b375c3514b1658e2b8dc1812050e5750634c5c53f4e189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Array--Unique \
perl-Array--Unique--Hash \
perl-Array--Unique--IxHash \
perl-Array--Unique--Quick \
perl-Array--Unique--Std \
perl-Array-Unique"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
