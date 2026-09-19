SUMMARY = "Represent an operation awaiting completion"
DESCRIPTION = "A 'Future' object represents an operation that is currently in progress, or \
has recently completed. It can be used in a variety of ways to manage the \
flow of control, and data, through an asynchronous program. \
 \
Some futures represent a single operation and are explicitly marked as \
ready by calling the 'done' or 'fail' methods. These are called 'leaf' \
futures here, and are returned by the 'new' constructor. \
 \
Other futures represent a collection of sub-tasks, and are implicitly \
marked as ready depending on the readiness of their component futures as \
required. These are called 'convergent' futures here as they converge \
control and data-flow back into one place. These are the ones returned by \
the various 'wait_*' and 'need_*' constructors. \
 \
It is intended that library functions that perform asynchronous operations \
would use future objects to represent outstanding operations, and allow \
their calling programs to control or wait for these operations to complete. \
The implementation and the user of such an interface would typically make \
use of different methods on the class. The methods below are documented in \
two sections; those of interest to each side of the interface. \
 \
It should be noted however, that this module does not in any way provide an \
actual mechanism for performing this asynchronous activity; it merely \
provides a way to create objects that can be used for control and data flow \
around those operations. It allows such code to be written in a neater, \
forward-reading manner, and simplifies many common patterns that are often \
involved in such situations. \
 \
See also Future::Utils which contains useful loop-constructing functions, \
to run a future-returning function repeatedly in a loop. \
 \
Unless otherwise noted, the following methods require at least version \
_0.08_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.520.0"

RPM_NAME = "perl-Future-0.520.0-1.6.noarch.rpm"
RPM_HASH = "4a233c456527559ee117fccf468e6436149e498c566e2082fc28addc75acb587a21018a8f22b52b73e0760952aca77e278fb9f81de3fe0b5433b85a2dd905984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Future \
perl-Future--Exception \
perl-Future--Mutex \
perl-Future--PP \
perl-Future--Utils \
perl-Test--Future \
perl-Test--Future--Deferred"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-List--Util"

inherit rpm
