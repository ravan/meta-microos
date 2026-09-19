SUMMARY = "An abstract Moose role for setting attributes from a configfile"
DESCRIPTION = "This is an abstract role which provides an alternate constructor for \
creating objects using parameters passed in from a configuration file. The \
actual implementation of reading the configuration file is left to concrete \
sub-roles. \
 \
It declares an attribute 'configfile' and a class method 'new_with_config', \
and requires that concrete roles derived from it implement the class method \
'get_config_from_file'. \
 \
Attributes specified directly as arguments to 'new_with_config' supersede \
those in the configfile. \
 \
the MooseX::Getopt manpage knows about this abstract role, and will use it \
if available to load attributes from the file specified by the command line \
flag '--configfile' during its normal 'new_with_options'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-MooseX-ConfigFromFile-0.14-1.39.noarch.rpm"
RPM_HASH = "d324544c891c598d9c82643ddae2ea661966fbd52cd6c9ee6e7ec07438c0e871f675f9f8918abf79451d33d670333665b100eca83dc4fd67c6b275f2317aadac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ConfigFromFile \
perl-MooseX-ConfigFromFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose--Role \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Path--Tiny \
perl-namespace--autoclean"

inherit rpm
