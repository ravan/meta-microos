SUMMARY = "Attempt to recover from people calling UNIVERSAL::isa as a function"
DESCRIPTION = "Whenever you use UNIVERSAL/isa as a function, a kitten using \
Test::MockObject dies. Normally, the kittens would be helpless, but if they \
use UNIVERSAL::isa (the module whose docs you are reading), the kittens can \
live long and prosper. \
 \
This module replaces 'UNIVERSAL::isa' with a version that makes sure that, \
when called as a function on objects which override 'isa', 'isa' will call \
the appropriate method on those objects \
 \
In all other cases, the real 'UNIVERSAL::isa' gets called directly. \
 \
*NOTE:* You should use this module only for debugging purposes. It does not \
belong as a dependency in running code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20171012"

RPM_NAME = "perl-UNIVERSAL-isa-1.20171012-1.36.noarch.rpm"
RPM_HASH = "5ac872942cb8eaee81f4e214ec6038cf40b5da44d0ae94f45ed141034086a712a68b089ce2bee613327cf5d30ddbf047fbf7ab553c953f9bfed19159d344ccdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL--isa \
perl-UNIVERSAL-isa"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
