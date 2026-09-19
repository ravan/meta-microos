SUMMARY = "Working (require 'Class::Name') and more"
DESCRIPTION = "'require EXPR' only accepts 'Class/Name.pm' style module names, not \
'Class::Name'. How frustrating! For that, we provide 'load_class \
'Class::Name''. \
 \
It's often useful to test whether a module can be loaded, instead of \
throwing an error when it's not available. For that, we provide \
'try_load_class 'Class::Name''. \
 \
Finally, sometimes we need to know whether a particular class has been \
loaded. Asking '%INC' is an option, but that will miss inner packages and \
any class for which the filename does not correspond to the package name. \
For that, we provide 'is_class_loaded 'Class::Name''."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.250.0"

RPM_NAME = "perl-Class-Load-0.250.0-1.7.noarch.rpm"
RPM_HASH = "4fdc8731d0b12d30ad6ca23b7c5e20b69233996e0424a4d2c4298daea218a1ef8697d2c41b5ba544a8127b9d1ff5ad7d40359311c84330746f28d964e8ccd4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Load \
perl-Class--Load--PP \
perl-Class-Load"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--OptList \
perl-Module--Implementation \
perl-Module--Runtime \
perl-Package--Stash \
perl-Try--Tiny"

inherit rpm
