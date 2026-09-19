SUMMARY = "Perl module enabling one to delete subroutines"
DESCRIPTION = "This module provides one function, 'delete_sub', that deletes the \
subroutine whose name is passed to it. (To load the module without \
importing the function, write 'use Sub::Delete();'.) \
 \
This does more than simply undefine the subroutine in the manner of 'undef \
&foo', which leaves a stub that can trigger AUTOLOAD (and, consequently, \
won't work for deleting methods). The subroutine is completely obliterated \
from the symbol table (though there may be references to it elsewhere, \
including in compiled code)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.00003"

RPM_NAME = "perl-Sub-Delete-1.00003-1.5.noarch.rpm"
RPM_HASH = "90ef77c98d3c405402ea65717370afe8b6cf90f037043924daf8de0c71548310982f508aa96050a84c8efa963cb40457a8f6855256b0447978490dd28a7e83a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Delete \
perl-Sub-Delete"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
