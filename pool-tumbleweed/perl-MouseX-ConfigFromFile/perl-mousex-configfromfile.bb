SUMMARY = "An abstract Mouse role for setting attributes from a configfile"
DESCRIPTION = "This is an abstract role which provides an alternate constructor for \
creating objects using parameters passed in from a configuration file. The \
actual implementation of reading the configuration file is left to concrete \
subroles. \
 \
It declares an attribute 'configfile' and a class method 'new_with_config', \
and requires that concrete roles derived from it implement the class method \
'get_config_from_file'. \
 \
Attributes specified directly as arguments to 'new_with_config' supercede \
those in the configfile."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-MouseX-ConfigFromFile-0.05-4.33.noarch.rpm"
RPM_HASH = "6a91cff691dfe618f81a260184c5c02631115b436d887eb0c674154b5a54ce954c41bc20f81d05dc8ad5736e77b4990fb21f177af37e667c77497c21edcd9477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--ConfigFromFile \
perl-MouseX-ConfigFromFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mouse \
perl-MouseX--Types--Path--Class"

inherit rpm
