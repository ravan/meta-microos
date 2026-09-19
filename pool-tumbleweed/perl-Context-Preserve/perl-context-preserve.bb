SUMMARY = "Run code after a subroutine call, preserving the context the subroutine [cut]"
DESCRIPTION = "Sometimes you need to call a function, get the results, act on the results, \
then return the result of the function. This is painful because of \
contexts; the original function can behave different if it's called in \
void, scalar, or list context. You can ignore the various cases and just \
pick one, but that's fragile. To do things right, you need to see which \
case you're being called in, and then call the function in that context. \
This results in 3 code paths, which is a pain to type in (and maintain). \
 \
This module automates the process. You provide a coderef that is the \
'original function', and another coderef to run after the original runs. \
You can modify the return value (aliased to @_) here, and do whatever else \
you need to do. 'wantarray' is correct inside both coderefs; in 'after', \
though, the return value is ignored and the value 'wantarray' returns is \
related to the context that the original function was called in."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.30.0"

RPM_NAME = "perl-Context-Preserve-0.30.0-1.5.noarch.rpm"
RPM_HASH = "51f4ee09f01d5316ea62b6c16a6e50a1111a75de96eae2754ac4c76a14452ce540eed72b5cc552e67c37bc6cc8bdf9d9db53b551a9c4d69552e47559fcfcacc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Context--Preserve \
perl-Context-Preserve"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
