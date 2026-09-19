SUMMARY = "Automatically give your module the ability to have plugins"
DESCRIPTION = "Provides a simple but, hopefully, extensible way of having 'plugins' for \
your module. Obviously this isn't going to be the be all and end all of \
solutions but it works for me. \
 \
Essentially all it does is export a method into your namespace that looks \
through a search path for .pm files and turn those into class names. \
 \
Optionally it instantiates those classes for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.400.0"

RPM_NAME = "perl-Module-Pluggable-6.400.0-1.1.noarch.rpm"
RPM_HASH = "28b28074370df941baef46f8261d5ef083e1bde0bdf638ff53df778512c4b2d978bfbbd3eff93fb4103a5a3a1118da6d14ef0fb5fde7cc9a1e0d546950bfb98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--InnerPackage \
perl-Module--Pluggable \
perl-Module--Pluggable--Object \
perl-Module-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
